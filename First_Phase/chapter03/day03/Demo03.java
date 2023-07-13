package day03;

public class Demo03 {
    public static void main(String[] args) {

        for (int line = 1; line <= 9; line++) {
            for (int i = 1; i <= line; i++) {
                System.out.print(i + "x" + line + "=" + (i * line) + "\t");
            }
            System.out.println();
        }
    }
}