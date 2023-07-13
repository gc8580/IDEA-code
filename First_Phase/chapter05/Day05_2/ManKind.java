package Day05_2;

public class ManKind {

    private int sex;// 性别
    private int salary;// 薪资

    public ManKind() {
    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     *
     * @Description 根据sex的值显示“man”(sex==1)或者“woman”(sex==0)；
     * @author Zhkey
     * @data 2020年11月23日
     */
    public void manOrWoman() {
        if (sex == 1)
            System.out.println("man");
        else if (sex == 0)
            System.out.println("woman");
    }

    /**
     *
     * @Description 根据salary的值显示“no job”(salary==0)或者“ job”(salary!=0)。
     * @author Zhkey
     * @data 2020年11月23日
     */
    public void employeed() {
        if (salary == 0)
            System.out.println("no job");
        else
            System.out.println("job");
    }
}
