package Day04;

import java.util.Scanner;
import java.util.Random;

public class Demo04 {
    public static void main(String[] args) {
        //创建一个动态数组
        int[] codes = new int[5];
        //输入5个工人的工号
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= codes.length; i++) {
            System.out.println("请输入第" + i + "个人的工号:");
            int sc = scanner.nextInt();
            codes[i - 1] = sc;
        }
        //产生一个随机索引数据
        Random random = new Random();
        //int key=random.nextInt(5)+1;//产生一个0-4的随机索引数据
        for (int i = 0; i < codes.length; i++) {
            int key = random.nextInt(codes.length);
            while (i != key) {
                int temp;
                temp = codes[i];
                codes[i] = codes[key];
                codes[key] = temp;
                break;
            }
        }
        System.out.println("随机排名后工人的序列时:");
        for (int j = 0; j < codes.length; j++) {
            System.out.print(codes[j] + "\t");
        }
    }
}
