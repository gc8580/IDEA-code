package com;

import java.util.Random;

/**
 * @BelongsProject: Day1
 * @BelongsPackage: com
 * @Author: Jove
 * @CreateTime: 2023-07-13  22:55
 * @Description: 随机验证码
 */

public class Demo02 {
    public static void main(String[] args) {
        System.out.println("验证码为：" + CreateCode(5));
    }
    public static String CreateCode(int n){
        Random r = new Random();
        String code = "";
        for (int i=1; i <= n; i++){
            int type = r.nextInt(3);
            switch (type){
                case 1:
                    code += r.nextInt(10);
                    break;
                case 2:
                    char ch1 = (char) (r.nextInt(26)+65);
                    code += ch1;
                    break;
                case 0:
                    char ch2 = (char) (r.nextInt(26)+97);
                    code += ch2;
                    break;
            }
        }
        return code;
    }
}


