package Day13;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day13
 * @Author: Jove
 * @CreateTime: 2023-02-24  19:46
 * @Description: TODO
 */


public class Student {
    private String name;
    private char sex;
    private int age;
    private String className;
    private String hobby;

    public Student() {
    }

    public Student(String name, char sex, int age, String className, String hobby) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.className = className;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}

