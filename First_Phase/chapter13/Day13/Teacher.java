package Day13;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day13
 * @Author: Jove
 * @CreateTime: 2023-02-24  19:46
 * @Description: TODO
 */


public class Teacher {
    private String name;
    private char sex;
    private double salary;

    public Teacher() {
    }

    public Teacher(String name, char sex, double salary) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

