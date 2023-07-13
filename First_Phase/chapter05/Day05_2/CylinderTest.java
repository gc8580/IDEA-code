package Day05_2;

public class CylinderTest {

    public static void main(String[] args) {
        Cylinder cy = new Cylinder();

        cy.setRadius(2.1);
        cy.setLength(3.4);
        System.out.println("圆柱的体积为：" + cy.findVolume());

        System.out.println("底面圆的面积为：" + cy.findArea());

        /**
         * @description:
         * @author: Jove
         * @date: 2023/2/23 16:31
         * @param: args
         * 附加题：在TestCylinder类中创建一个Circle类的对象，设置圆的半径，计算输出圆的面积。体会父类和子类成员的分别调用
         **/
        Circle c1 = new Circle();
        c1.setRadius(5.0);
        System.out.println(c1.findArea());
    }
}

