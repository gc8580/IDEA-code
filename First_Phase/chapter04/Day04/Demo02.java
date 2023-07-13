package Day04;

public class Demo02 {
    public static void main(String[] args) {
        int[] money = {16, 26, 36, 6, 100};
        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println("数组的元素和是" + sum);
    }
}
