package com;

/**
 * @BelongsProject: Day1
 * @BelongsPackage: com
 * @Author: Jove
 * @CreateTime: 2023-07-13  13:22
 * @Description: 买飞机票
 */

public class Demo01 {
    public static void main(String[] args) {
        System.out.println("最终优惠价格：" + calculate(1000,8,"经济舱"));
    }
    public static double calculate(double price, int mounth, String type){
        if(mounth >= 5 && mounth <= 10){
            //旺季
            switch (type){
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济舱":
                    price *= 0.85;
                    break;
            }
        }else{
            //淡季
            switch (type){
                case "头等舱":
                    price *= 0.7;
                    break;
                case "经济舱":
                    price *= 0.65;
                    break;
            }

        }

        return price;
    }

}


