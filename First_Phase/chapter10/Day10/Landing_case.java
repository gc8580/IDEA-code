package Day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day10
 * @Author: Jove
 * @CreateTime: 2023-02-24  17:56
 * @Description: TODO
 */

public class Landing_case {
    public static void main(String[] args) {
        try (
                //建立一个缓冲字符输入流管道与源文件接通
                BufferedReader brd = new BufferedReader(new FileReader("chapter10\\Landing.txt"));
        ) {
            //将文件中每一行用户名和密码存入集合中
            String line = "";
            List list = new ArrayList();
            while ((line = brd.readLine()) != null){
                list.add(line);
            }
            Scanner sc = new Scanner(System.in);
            System.out.print("用户名：");
            String username = sc.next();
            System.out.print("密码：");
            String password = sc.next();
            boolean flag = false;
            //在输入的用户名和密码中添加共同的标识（username=用户名&password=密码）
            String login = "username=" +username + "&password=" + password;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(login)) {
                    flag = true;
                    break;
                }
            }
            if (flag == false){
                System.out.println("登录失败");
            }else{
                System.out.println("登录成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


