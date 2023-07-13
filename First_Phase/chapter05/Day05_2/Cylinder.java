package Day05_2;


public class Cylinder extends Circle {

    private double length;

    public Cylinder() {
        length =1;
    }

    public Cylinder(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    /*
    *findVolume方法怎样做相应的修改？
    * */
//    public double findVolume() {
//        return findArea() * length;
//    }
    public double findVolume() {
        return this.findArea() * this.length;
    }
    /*
    * 修改练习1.3中定义的Cylinder类，在Cylinder类中覆盖findArea()方法，计算圆柱的表面积。
    * */
    public double findArea() {
        return super.findArea();
    }

}

