package Day05_2;


/**
 * Created with IntelliJ IDEA.
 *定义猴子类，猴子有名字和性别等属性，并且定义猴子说话的方法，定义人类，人有 名字和性别等属性，
 * 并且定义人说话的方法。使用继承，让代码具有复用性。
 */
public class Demo01 {
    public static void main(String[] args) {
        Person person = new Person("张三", 1);
        person.speak();
    }
}

class Monkey {
    private String name;
    private int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Monkey(String name, int sex) {
        this.name = name;
        this.sex = sex;
    }

    public Monkey() {
    }

    public void speak() {
        System.out.println(this.name + " 咿咿呀呀！");
    }
}

class Person extends Monkey {

    public Person(String name, int sex) {
        super(name, sex);
    }

    @Override
    public void speak() {
        System.out.println(this.getName() + ", 你好呀！");

    }
}

