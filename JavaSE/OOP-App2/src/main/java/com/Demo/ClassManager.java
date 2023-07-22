package com.Demo;

import java.util.ArrayList;

/** 班级类
 * @BelongsProject: JavaSE
 * @BelongsPackage: com.Demo
 * @Author: Jove
 * @CreateTime: 2023-07-22  21:33
 * @Description: TODO
 */

public class ClassManager {
    private ArrayList<Student> students = new ArrayList<>();
    //private StudentOperator studentOperator = new StudentOperatorImpl1();
    private StudentOperator studentOperator = new StudentOperatorImpl2();


    public ClassManager(){
        students.add(new Student("迪丽热巴", '女', 99));
        students.add(new Student("古力娜扎", '女', 100));
        students.add(new Student("马尔扎哈", '男', 80));
        students.add(new Student("卡尔扎巴", '男', 60));
    }

    public void printScore(){
        studentOperator.printAverageScore(students);
    }

    public void printInfo(){
        studentOperator.printAllInfo(students);
    }
}


