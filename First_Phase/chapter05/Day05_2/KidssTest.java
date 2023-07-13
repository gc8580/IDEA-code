package Day05_2;

public class KidssTest {

    public static void main(String[] args) {
        Kidss someKids = new Kidss(12);

        someKids.printAge();

        someKids.setSex(1);
        someKids.setSalary(0);

        someKids.employeed();
        someKids.manOrWoman();
    }
}


