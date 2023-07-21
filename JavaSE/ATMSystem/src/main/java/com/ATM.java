package com;

import java.awt.peer.SystemTrayPeer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @BelongsProject: JavaSE
 * @BelongsPackage: com
 * @Author: Jove
 * @CreateTime: 2023-07-21  17:32
 * @Description: TODO
 */

public class ATM {
    private ArrayList<Account> accounts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private Account loginAcc;

    public void start(){
        while (true) {
            System.out.println("===欢迎您进入到了ATM系统===");
            System.out.println("1、用户登录");
            System.out.println("2、用户开户");
            System.out.println("请选择：");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    // 用户登录
                    login();
                    break;
                case 2:
                    // 用户开户
                    createAccount();
                    break;
                default:
                    System.out.println("没有该操作~~");
            }
        }
    }

    private void createAccount(){
        System.out.println("==系统开户操作==");
        // 1、创建一个账户对象，用于封装用户的开户信息
        Account acc = new Account();

        // 2、需要用户输入自己的开户信息，赋值给账户对象
        System.out.println("请您输入您的账户名称：");
        String name = sc.next();
        acc.setUserName(name);

        while (true) {
            System.out.println("请您输入您的性别：");
            char sex = sc.next().charAt(0); // "男"
            if(sex == '男' || sex == '女'){
                acc.setSex(sex);
                break;
            }else {
                System.out.println("您输入的性别有误~只能是男或者女~");
            }
        }

        while (true) {
            System.out.println("请您输入您的账户密码：");
            String passWord  = sc.next();
            System.out.println("请您输入您的确认密码：");
            String okPassWord  = sc.next();
            // 判断2次密码是否一样。
            if(okPassWord.equals(passWord)){
                acc.setPassWord(okPassWord);
                break;
            }else {
                System.out.println("您输入的2次密码不一致，请您确认~~");
            }
        }

        System.out.println("请您输入您的取现额度：");
        double limit = sc.nextDouble();
        acc.setLimit(limit);

        // 重点：我们需要为这个账户生成一个卡号（由系统自动生成。8位数字表示，不能与其他账户的卡号重复：会在下节课详细讲解）
        String newCardId = createCardId();
        acc.setCardId(newCardId);

        // 3、把这个账户对象，存入到账户集合中去
        accounts.add(acc);
        System.out.println("恭喜您，" + acc.getUserName() + "开户成功，您的卡号是：" + acc.getCardId());
    }

    private String createCardId() {
        while (true) {
            String card = "";
            Random random = new Random();
            for (int i = 0; i < 8; i++) {
                int data = random.nextInt(10);
                card += data;
            }
            Account acc = getAccountByCardId(card);
            if(acc == null){
                return card;
            }
        }
    }

    private Account getAccountByCardId(String cardId){
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if(acc.getCardId().equals(cardId)){
                return acc;
            }
        }
        return null;
    }

    private void login() {

        System.out.println("==系统登录==");
        // 1、判断系统中是否存在账户对象，存在才能登录，如果不存在，我们直接结束登录操作
        if(accounts.size() == 0){
            System.out.println("当前系统中无任何账户，请先开户再来登录~~");
            return; // 跳出登录操作。
        }

        while (true) {
            System.out.println("请您输入您的登录卡号：");
            String cardId = sc.next();
            // 3、判断这个卡号是否存在啊？
            Account acc = getAccountByCardId(cardId);
            if(acc == null){
                // 说明这个卡号不存在。
                System.out.println("您输入的登录卡号不存在，请确认~~");
            }else {
                while (true) {
                    // 卡号存在了，接着让用户输入密码
                    System.out.println("请您输入登录密码：");
                    String passWord = sc.next();
                    // 4、判断密码是否正确
                    if(acc.getPassWord().equals(passWord)){
                        loginAcc = acc;
                        // 密码正确了，登录成功了
                        System.out.println("恭喜您，" + acc.getUserName() + "成功登录了系统，您的卡号是：" + acc.getCardId());
                        // 展示登录后的操作界面了
                        showUserCommand();
                        return; // 跳出并结束当前登录方法
                    }else {
                        System.out.println("您输入的密码不正确，请确认~~");
                    }
                }
            }
        }

    }


    private void showUserCommand() {
        while (true) {
            System.out.println(loginAcc.getUserName() + "您可以选择如下功能进行账户的处理====");
            System.out.println("1、查询账户");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、密码修改");
            System.out.println("6、退出");
            System.out.println("7、注销当前账户");
            System.out.println("请选择：");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    // 查询当前账户
                    showLoginAccount();
                    break;
                case 2:
                    // 存款
                    depositMoney();
                    break;
                case 3:
                    // 取款
                    drawMoney();
                    break;
                case 4:
                    // 转账
                    transferMoney();
                    break;
                case 5:
                    // 密码修改
                    updatePassWord();
                    return;// 跳出并结束当前方法
                case 6:
                    // 退出
                    System.out.println(loginAcc.getUserName() + "您退出系统成功！");
                    return; // 跳出并结束当前方法
                case 7:
                    // 注销当前登录的账户
                    if(deleteAccount()){
                        // 销户成功了，回到欢迎界面
                        return;
                    }
                    break;
                default:
                    System.out.println("您当前选择的操作是不存在的，请确认~~");
            }
        }
    }



    private void updatePassWord() {

    }

    private void transferMoney() {

    }

    private void depositMoney() {

    }

    private void drawMoney() {

    }

    private void showLoginAccount() {
        System.out.println("==当前您的账户信息如下：==");
        System.out.println("卡号：" + loginAcc.getCardId());
        System.out.println("户主：" + loginAcc.getUserName());
        System.out.println("性别：" + loginAcc.getSex());
        System.out.println("余额：" + loginAcc.getMoney());
        System.out.println("每次取现额度：" + loginAcc.getLimit());
    }

    private boolean deleteAccount() {

    }

}


