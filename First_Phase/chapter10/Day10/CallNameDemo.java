package Day10;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day10
 * @Author: Jove
 * @CreateTime: 2023-02-24  17:37
 * @Description: TODO
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CallNameDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("chapter10//Name.txt"));//存储文件的路径

        ArrayList<String> array = new ArrayList<String>();

        String line;
        while ((line = br.readLine())!=null){
            array.add(line);
        }
        br.close();
        //获取一个随机数
        Random r = new Random();
        int index = r.nextInt(array.size());

        String name = array.get(index);
        System.out.println("幸运的同学是："+name);
    }
}




