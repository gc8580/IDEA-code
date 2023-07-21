package oop;

/**
 * @BelongsProject: JavaSE
 * @BelongsPackage: oop
 * @Author: Jove
 * @CreateTime: 2023-07-20  08:50
 * @Description: TODO
 */

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Jove";
        student.chinese = 100;
        student.math = 100;
        student.printAverageScore();
        student.printTotalScore();
    }
}


