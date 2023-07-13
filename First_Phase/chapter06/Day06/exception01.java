package Day06;

import java.util.Scanner;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day06
 * @Author: Jove
 * @CreateTime: 2023-02-23  19:37
 * @Description: 1.键盘录入一个合理的价格为止（必须是数值）。定义一个死循环，让用户不断的输入价格。
 */

public class exception01 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("请您输入合法的价格：");
                String priceStr = sc.nextLine();
                // 转换成double类型的价格
                double price = Double.valueOf(priceStr);

                // 判断价格是否大于 0
                if(price > 0) {
                    System.out.println("定价：" + price);
                    break;
                }else {
                    System.out.println("价格必须是正数~~~");
                }
            } catch (Exception e) {
                System.out.println("用户输入的数据有毛病，请您输入合法的数值，建议为正数~~");
            }
        }
    }

}


