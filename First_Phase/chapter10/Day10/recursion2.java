package Day10;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day10
 * @Author: Jove
 * @CreateTime: 2023-02-24  09:36
 * @Description: TODO
 */

public class recursion2 {
    public static void main(String[] args) {
        int nowDay = 10; //已知第nowDay天
        int num = 1;//有num个桃子
        int day = 1;//求第day天有的桃子数
        System.out.println("猴子在第1天摘了" + total(day, nowDay, num) + "个桃子");
    }

    public static int total(int day, int nowDay, int num) {
        int sum;
        if (nowDay == day) {
            System.out.println("第" + day + "天有桃子:" + num);
            return num;
        } else {
            sum = (total(day + 1, nowDay, num) + 1) * 2;
        }
        System.out.println("第" + day + "天有桃子:" + sum);
        return sum;
    }
}


