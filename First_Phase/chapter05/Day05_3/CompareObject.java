package Day05_3;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day05_3
 * @Author: Jove
 * @CreateTime: 2023-02-23  16:43
 * @Description: TODO
 */


public interface CompareObject {

    public int compareTo(Object o);

    class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public String toString() {
            return "半径" + radius;
        }

    }

    class ComparableCircle extends Circle implements CompareObject {

        public ComparableCircle(double radius) {
            super(radius);
        }

        @Override
        public int compareTo(Object o) {
            if (o instanceof Circle) {// 如果不进行预判出现ClassCastException
                if (this.getRadius() == ((Circle) o).getRadius()) {
                    return 0;
                } else if (this.getRadius() < ((Circle) o).getRadius()) {
                    return -1;
                } else {
                    return 1;
                }

            }
            return 2;

        }
    }

    class TestInterface {
        public static void main(String[] args) {
            CompareObject c1 = new ComparableCircle(10);// 可以使用多态和本态，优先使用多态（站高望远）
            CompareObject c2 = new ComparableCircle(10);
            int compRs = c1.compareTo(c2);
            System.out.println(compRs);
            switch (compRs) {
                case 0:
                    System.out.println("相等");
                    break;
                case 1:
                    System.out.println("右边大");
                    break;
                case -1:
                    System.out.println("左边大");
                    break;

                default:
                    break;
            }

        }
    }

}

