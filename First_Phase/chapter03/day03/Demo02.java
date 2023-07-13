package day03;

public class Demo02 {
    public static void main(String[] args) {
        int chinese = 90;
        int english = 80;
        int math = 70;
        System.out.println("三门课总成绩为：" + (chinese + english + math));
        System.out.println("三门课平均成绩为：" +(chinese + english + math)/3);
        if(((chinese + english + math)/3) > 70)
        System.out.println("批注：优" );

    }
}
