package com;

import java.util.Random;
import java.util.Scanner;

/**
 * @BelongsProject: Day1
 * @BelongsPackage: com
 * @Author: Jove
 * @CreateTime: 2023-07-19  21:26
 * @Description: 抢红包
 */

public class Demo05 {
    public static void main(String[] args) {
        int[] moneys = {9,666,188,520,9999};
        start(moneys);
        //System.out.println(start(moneys));
    }
    public static void start(int[] moneys){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i=1; i <= 5; i++){
            System.out.println("请您输入任意内容进行抽奖：");
            sc.next();
            while (true) {
                int index = r.nextInt(moneys.length);
                int money = moneys[index];
                if(money != 0){
                    System.out.println("抽中的红包为：" + money);
                    moneys[index] = 0;
                    break;
                }
            }

        }
        System.out.println("活动已结束");
    }
}


