package Day11;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day11
 * @Author: Jove
 * @CreateTime: 2023-02-24  19:33
 * @Description: TODO
 */

public class TakeMoneyTest {
    public static void main(String[] args) {
        Account account = new Account("IBC001",100000);
        Thread xiaohong = new DrawMoneyThread(account);
        xiaohong.setName("小红");
        Thread xiaoming = new DrawMoneyThread(account);
        xiaoming.setName("小明");
        xiaohong.start();
        xiaoming.start();

//        Account account1 = new Account("IBC002",100000);
//        Thread xiaozhang = new DrawMoneyThread(account1);
//        xiaozhang.setName("小张");
//        Thread xiaoli = new DrawMoneyThread(account1);
//        xiaoli.setName("小李");
//        xiaozhang.start();
//        xiaoli.start();
    }
}
class DrawMoneyThread extends Thread{
    private Account account;
    public DrawMoneyThread(Account account){
        this.account = account;
    }
    @Override
    public void run() {
        account.takeMoney(100000);
    }
}



