package day03;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入一个数：");
            int num = input.nextInt();
            String result = (num % 2 == 0) ? "B" : "A";
            System.out.println(result);
        }
    }
}
