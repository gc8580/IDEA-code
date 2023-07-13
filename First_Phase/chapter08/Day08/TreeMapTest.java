package Day08;

import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Student3, String> tm = new TreeMap<>();
        Student3 s1 = new Student3("xiaohei", 60, 60, 60);
        Student3 s2 = new Student3("dapang", 70, 70, 70);
        Student3 s3 = new Student3("xiaobai", 80, 80, 80);

        int a = s1.getChinese()+s1.getMath()+s1.getEnglish();
        int b = s2.getChinese()+s2.getMath()+s2.getEnglish();
        int c = s3.getChinese()+s3.getMath()+s3.getEnglish();

        tm.put(s1, String.valueOf(a));
        tm.put(s2, String.valueOf(b));
        tm.put(s3, String.valueOf(c));

        tm.forEach(
                (Student3 key, String value) -> {
                    System.out.println(key + "---" + value);
                }
        );
    }
}
class Student3 implements Comparable<Student3> {

    private String name;
    int chinese;
    int math;
    int english;

    @Override
    public String toString() {
        return name;
    }

    public Student3() {
    }

    public Student3(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public int compareTo(Student3 o) {
        int sum = o.getEnglish() + o.getMath() + o.getChinese();
        int sum2 = this.getChinese() + this.getMath() + this.getChinese();
        return sum - sum2;
    }
}