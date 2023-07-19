package com;

import java.util.*;

/**
 * @BelongsProject: Day1
 * @BelongsPackage: com
 * @Author: Jove
 * @CreateTime: 2023-07-13  23:05
 * @Description: 评委打分
 */

public class Demo03 {
    public static void main(String[] args) {
        System.out.println(getAverageScore(6));
    }
    public static double getAverageScore(int number){
        int[] scores = new int[number];
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<scores.length; i++){
            System.out.println("请您录入第" + (i+1) + "个评委的分数");
            int score = scanner.nextInt();
            scores[i] = score;
        }
        Arrays.sort(scores);
        for(int j=1; j<scores.length-1; j++){
            sum += scores[j];
        }
        return 1.0 *(sum/(number-2));
    }
}


