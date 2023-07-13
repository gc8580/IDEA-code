package Day04;

public class Demo01 {
    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        Demo01 Fibo=new Demo01();
        System.out.println("斐波那契数列的前20项");
        for(int i=1;i<=20;i++) {
            System.out.println("第"+i+"项为："+Fibo.fibo(i));
        }
    }
    public int fibo(int a) {
        if(a==1)
            return 1;
        else if(a==2)
            return 1;
        else
            return fibo(a-1)+fibo(a-2);
    }
}
