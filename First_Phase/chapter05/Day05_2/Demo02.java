package Day05_2;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *设计一个 Birthday 类，其成员变量有：year、month、day。提供构造方法、输出 Birthday 对象值的方法和计算年龄的方法。
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入生日年份");
        int year = scanner.nextInt();
        System.out.println("输入生日月份");
        int month = scanner.nextInt();
        System.out.println("输入生日日期");
        int day = scanner.nextInt();

        Birthday birthday = new Birthday(year, month, day);
        System.out.println("生日是：" + birthday.toString());
        System.out.println("年龄是：" + birthday.getAge(year));

    }
}

class Birthday {
    int year;
    int month;
    int day;

    public Birthday() {
    }

    public Birthday(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year +
                " 年 " + month +
                " 月 " + day +
                " 日";
    }

    /**
     * 求年龄
     *
     * @param year 生日的年份
     * @return 年龄
     */
    public int getAge(int year) {
        // 获取当前时间
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR) - year;
    }
}
