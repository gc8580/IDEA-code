package Day05_3;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day05_3
 * @Author: Jove
 * @CreateTime: 2023-02-23  16:36
 * @Description:
 * ①：某公司的员工信息系统中，需要定义一个公司的员工类Employee，包含如下信息（name, age , 所在部门名称dept ） ,
 * 定义一个静态的成员变量company记录公司的名称。
 * ②：需要在Employee类中定义一个方法showInfos()，用于输出当前员工对象的信息。如name, age ，dept 以及公司名称company的信息。
 * ③：需要在Employee类中定义定义一个通用的静态方法compareByAge，用于传输两个员工对象的年龄进入，并返回比较较大的年龄，例如：2个人中的最大年龄是:45岁
 */

public class Employee {
    private String name;
    private int age;
    private String dept;    //所在部门名称

    private static String company = "华为";  //记录公司名称

    //输出当前员工对象的信息
    public void showInfos(String name, int age, String  dept)
    {
        this.name = name;
        this.age = age;
        this.dept = dept;
        System.out.println("该员工的名字为："+this.name);
        System.out.println("该员工的年龄为："+this.age);
        System.out.println("该员工所在部门名称为："+this.dept);
        System.out.println("该员工所在公司为："+ Employee.company);
    }

    //返回两者之间最大年龄
    public static int compareBvAge(int age1, int age2)
    {
        System.out.println("2个人中最大年龄是："+(age1 > age2 ? age1 : age2));
        return age1 > age2 ? age1 : age2;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.showInfos("张三",22,"人力资源部");
        System.out.println();
        Employee employee2 = new Employee();
        employee2.showInfos("李四",40,"财务部");
        System.out.println();

        //返回最大年龄
        Employee.compareBvAge(employee1.age,employee2.age);
    }
}



