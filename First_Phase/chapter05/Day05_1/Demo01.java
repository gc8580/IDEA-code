package Day05_1;
//1、设计日期类，每个日期对象都可以描述年月日信息。
public class Demo01 extends Time{
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        System.out.println("年：" + demo01.getYear() + "月：" + demo01.getMounth()+ "日：" + demo01.getDay());
    }
}
class Time{
    private int Day;
    private int Year;
    private int Mounth;

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getMounth() {
        return Mounth;
    }

    public void setMounth(int mounth) {
        Mounth = mounth;
    }
}
