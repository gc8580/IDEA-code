package Day05_2;


/*
 * 定义类Kidss继承ManKind
 * 成员变量int yearsOld；
 * 方法printAge()打印yearsOld的值。
 */
public class Kidss extends ManKind{

    private int yearsOld;

    public Kidss() {

    }

    public Kidss(int yearsOld) {

        this.yearsOld = yearsOld;
    }

    public void printAge() {
        System.out.println("I am "+yearsOld+" years old");
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
    //employeed()方法的重写
    public void employeed() {
        System.out.println("Kids should study and no job");
    }
    //修改练习1.2中定义的类Kids中employeed()方法，
    //在该方法中调用父类ManKind的employeed()方法，然后再输出“but Kids should study and no job.”
    /*void employeed(){
        super.employeed();
        System.out.println("Kids should study and no job.");
    }*/

}
