package Day06;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day06
 * @Author: Jove
 * @CreateTime: 2023-02-23  19:38
 * @Description: TODO
 */

import java.util.Scanner;

public class exception02 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("请输入2个整数.");
        int a= input.nextInt();
        int b = input.nextInt();
        try {
            a = a/b;
        }catch(Exception e) {
            System.out.println("分母不能为0");
        }finally {
            System.out.println("程序运行结束.");
        }
    }

}


