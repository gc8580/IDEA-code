package com;

import java.util.Arrays;
import java.util.Collections;

/**
 * @BelongsProject: Day1
 * @BelongsPackage: com
 * @Author: Jove
 * @CreateTime: 2023-07-13  23:22
 * @Description: 数字加密
 */

public class Demo04 {
    public static void main(String[] args) {
        System.out.println(encrypt(1983));
    }
    public static String encrypt(int number){
        int[] numbers = split(number);
        for (int i=0; i < numbers.length; i++){
           numbers[i] = (numbers[i] + 5) % 10;
        }
//       reverse(numbers);
        String data = "";
        for (int i = numbers.length-1; i >= 0; i--) {
                data += numbers[i];
        }
        return data;
    }

//    public static void reverse(int[] numbers) {
//        Collections.reverse(Arrays.asList(numbers));
//        System.out.println(Arrays.asList(numbers));
//    }

    public static int[] split(int number) {
        int[] numbers = new int[4];
        numbers[0] = number/1000;
        numbers[1] = (number / 100) % 10;
        numbers[2] = (number / 10) % 10;
        numbers[3] = number % 10;

        return numbers;
    }
}


