package Day08;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day08
 * @Author: Jove
 * @CreateTime: 2023-02-23  19:51
 * @Description: TODO
 */

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class MyTest {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //按照总分排序
                int num = s1.getTotalScore() - s2.getTotalScore();
                //如果总分一样，再比较一下姓名
                int num2=num==0?s1.getName().compareTo(s2.getName()):num;
                return -num2;
            }
        });

        for (int i = 1; i <= 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入第"+i+"个学生的姓名");
            String name = scanner.nextLine();
            Student student = new Student();
            student.setName(name);
            System.out.println("请输入第"+i+"个学生的语文成绩");
            int yw = scanner.nextInt();
            student.setChineseScore(yw);
            System.out.println("请输入第" + i + "个学生的数学成绩");
            int sx = scanner.nextInt();
            student.setMathScore(sx);
            System.out.println("请输入第" + i + "个学生的英语成绩");
            int yy = scanner.nextInt();
            student.setEnglishScore(yy);
            //把学生对象，放到集合中
            treeSet.add(student);
        }

        //遍历集合，输出一个漂亮的内容
        System.out.println("序号\t姓名\t语文\t数学\t英语\t总分");
        int i=1;
        for (Student student : treeSet) {
            System.out.println((i++)+"\t"+student.getName()+"\t"+student.getChineseScore()+"\t"+student.getMathScore()+"\t"+student.getEnglishScore()+"\t"+student.getTotalScore());
        }
    }
}


