package Day05_3;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day05_3
 * @Author: Jove
 * @CreateTime: 2023-02-23  16:34
 * @Description: 编写一个类实现银行账户的概念，包含的属性有“帐号”、“密码”、“存款余额”、“利率”、“最小余额”，
 * 定义封装这些属性的方法。账号要自动生成。
 */


public class Account {
    private int account_number;//账号
    private int password;//密码
    private double deposit_balance;//存款余额
    private double interest_rate;//利率
    private double min_balance;//最小余额
    static int final_number = 2019001;{
        account_number = final_number;
        System.out.printf("账号为:%d\n", account_number);
        final_number++;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getDeposit_balance() {
        return deposit_balance;
    }

    public void setDeposit_balance(double deposit_balance) {
        this.deposit_balance = deposit_balance;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public double getMin_balance() {
        return min_balance;
    }

    public void setMin_balance(double min_balance) {
        this.min_balance = min_balance;
    }

    @Override
    public String toString() {
        return "Account [账号" + account_number + ", 密码" + password + ", 存款余额"
                + deposit_balance + ", 利率" + interest_rate + ", 最小余额" + min_balance + "]";
    }

}




