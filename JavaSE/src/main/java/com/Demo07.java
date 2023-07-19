package com;

import java.util.Random;
import java.util.Scanner;

/**
 * @BelongsProject: JavaSE
 * @BelongsPackage: com
 * @Author: Jove
 * @CreateTime: 2023-07-19  22:15
 * @Description: 模拟双色球
 */

public class Demo07 {
    public static void main(String[] args) {
        int[] userNumbers = userSelectNumbers();

        printArry(userNumbers);

        int[] luckNumbers = createLuckNumbers();

        printArry(luckNumbers);
    }

//    设计一个方法让用户投注一组号码并返回
    private static void printArry(int[] arr) {
        System.out.print('[');
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + "," );
        }
        System.out.println(']');
    }

    public static int[] userSelectNumbers(){
        int[] numbers = new  int[7];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length - 1; i++) {

            while (true) {
                System.out.println("请您输入第" + (i + 1) + "个红球号码（1-33之间，不能重复）");
                int number = scanner.nextInt();

                if(number > 33 || number < 1 ){
                    System.out.println("对不起，您输入的红球号码不在可选范围内，请重新输入：");
                }else {
                    if(exist(number,numbers)){
                        System.out.println("对不起，您当前选择的红球号码已重复，请重新确认。");
                    }else {
                        numbers[i] = number;
                        break;
                    }
                }
            }
        }
        while (true) {
            System.out.println("请输入最后一个篮球号码（1-16之间）：");
            int number = scanner.nextInt();
            if(number > 16 || number < 1 ){
                System.out.println("对不起，您输入的蓝球号码不在可选范围内，请重新输入：");
            }else{
                numbers[6] = number;
                break;
            }
        }
        return numbers;
    }

    private static boolean exist(int number, int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0){
                break;
            }
            if(numbers[i] == number){
                return true;
            }
        }
        return false;
    }

//    设计一个方法，随机一组中奖号码出来
    public static int[] createLuckNumbers(){
        int[]  numbers = new int[7];
        Random random = new Random();
        for (int i = 0; i < numbers.length - 1; i++) {


            while (true) {
                int number = random.nextInt(33) + 1;

                if(!exist(number,numbers)){
                    numbers[i] = number;
                    break;
                }
            }

        }
        numbers[6] = random.nextInt(16) + 1;
        return numbers;
    }

}


