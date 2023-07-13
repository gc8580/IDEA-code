package Day04;


import java.util.Arrays;
import java.util.Scanner;

public class Demo03 {

    public static void main(String[] args) {
        //使用冒泡排序法，对录入的10个整数按由小到大的顺序排序。
        int[] ns = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < ns.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个数：");
            ns[i] = scan.nextInt();
        }
        for (int i = 0; i < ns.length; i++) {
            for (int j = 0; j < ns.length - i - 1; j++) {
                if (ns[j] > ns[j + 1]) {
                    int temp = ns[j];
                    ns[j] = ns[j + 1];
                    ns[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ns));
    }
}
