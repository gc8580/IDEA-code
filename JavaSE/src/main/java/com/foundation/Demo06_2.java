package com.foundation;

/**
 * @BelongsProject: JavaSE
 * @BelongsPackage: com
 * @Author: Jove
 * @CreateTime: 2023-07-19  22:00
 * @Description: 找素数
 */

public class Demo06_2 {
    public static void main(String[] args) {
        search(101,200);
    }
    public static void search(int start , int end){
        int count = 0;

        OUT:  //外部循环指定标签
        for (int i=start; i <= end; i++){

            boolean flag = true;
            for (int j=2; j <= i / 2; j++ ){
                if (i % j == 0){
                    continue OUT;
                }
            }
            count++;
            System.out.println(i);
        }
        System.out.println(count);
    }
}


