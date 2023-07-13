package Day05_2;

public class KidsTest {

    public static void main(String[] args) {
        Kids someKids = new Kids(12);

        someKids.printAge();

        someKids.setSex(1);
        someKids.setSalary(0);

        someKids.employeed();
        someKids.manOrWoman();
    }
}


