package Day11;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day11
 * @Author: Jove
 * @CreateTime: 2023-02-24  19:33
 * @Description: TODO
 */


public class Account {
    private String cardCode;
    private double money;
//    private Object lock = new Object();

    public synchronized void takeMoney(double money){
//        synchronized (lock) {
//        synchronized (this) {
        System.out.println(Thread.currentThread().getName()+"准备来取钱");

        if (this.money >= money) {
            System.out.println(Thread.currentThread().getName() + "取出" + money + "钱");
            this.money -= money;
            System.out.println(Thread.currentThread().getName() + "成功取出" + money + "钱");
            System.out.println("剩余余额" + this.money);
        } else {
            System.out.println("余额不足，请及时充值");
        }
//       }
//     }
    }
    public Account(){}
    public Account(String cardCode, double money) {
        this.cardCode = cardCode;
        this.money = money;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}



