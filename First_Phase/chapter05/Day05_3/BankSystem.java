package Day05_3;

public class BankSystem {
    public static void main(String[] args) {
        gloden_card a = new gloden_card();
        a.setName("张三");
        a.setBalance(10000);

        a.PayMethod(500);

        System.out.println("-----------------");

        silver_card b = new silver_card();
        b.setName("李四");
        b.setBalance(5000);

        b.PayMethod(300);
        System.out.println("-----------------");
    }
}
abstract  class  card{
    String name;
    double balance;

    public abstract void PayMethod(double balance);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "card{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
class gloden_card extends card {

    @Override
    public void PayMethod(double balance) {
        System.out.println("您当前消费:" + balance);
        System.out.println("您卡内余额当前为：" + getBalance());
        double s = balance * 0.8;
        System.out.println("您支付了：" + s + "金额");
        System.out.println("当前卡内余额为：" + (getBalance() - s));
    }
}
class silver_card extends card{

    @Override
    public void PayMethod(double balance) {
        System.out.println("您当前消费:" + balance);
        System.out.println("您卡内余额当前为：" + getBalance());
        double s2 = balance * 0.85;
        System.out.println("您支付了：" + s2 + "金额");
        System.out.println("当前卡内余额为：" + (getBalance() - s2));
    }
}