package Day05_3;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day05_3
 * @Author: Jove
 * @CreateTime: 2023-02-23  16:34
 * @Description: 编写主类，使用银行账户类，输入、输出3个储户的上述信息。考虑：哪些属性可以设计成static属性。
 */

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner reader = new Scanner(System.in);
        Account user1 = new Account();
        Account user2 = new Account();
        Account user3 = new Account();
        System.out.println("设置密码：");
        user1.setPassword(reader.nextInt());
        user2.setPassword(reader.nextInt());
        user3.setPassword(reader.nextInt());
        System.out.println("输入存款：");
        user1.setDeposit_balance(reader.nextDouble());
        user2.setDeposit_balance(reader.nextDouble());
        user3.setDeposit_balance(reader.nextDouble());
        System.out.println("输入利率：");
        user1.setInterest_rate(reader.nextDouble());
        user2.setInterest_rate(reader.nextDouble());
        user3.setInterest_rate(reader.nextDouble());
        System.out.println("输入最小余额：");
        user1.setMin_balance(reader.nextDouble());
        user2.setMin_balance(reader.nextDouble());
        user3.setMin_balance(reader.nextDouble());
        System.out.println(user1.toString() + '\n' + user2.toString() + '\n' + user3.toString());
    }

}



