package Day05_2;

/**
 * Created with IntelliJ IDEA.
 *实现愤怒的小鸟
 * 不同种类的小鸟有不同飞行的方式：
 * 红火：红色小鸟，飞行方式：正常
 * 蓝冰：蓝色小鸟，飞行方式：分成 3 个
 * 黄风：黄色小鸟，飞行方式：加速。
 */
public class Demo03 {
    public static void main(String[] args) {
        Red red = new Red();
        Blue blue = new Blue();
        Yellow yellow = new Yellow();
        CataPult a = new CataPult();
        a.shot(red);
        a.shot(yellow);
        a.shot(blue);
    }

    public static class Yellow extends Bird{
        public Yellow() {
        }

        public void fly(){
            System.out.println("加速飞行");
        }
    }

    public static class Red extends Bird {
        public Red() {
        }

        public void fly(){
            System.out.println("正常飞行");
        }
    }

    public static class CataPult {
        public void shot(Bird bird){
            bird.fly();
        }
    }

    public static class Blue extends Bird{
        public Blue() {
        }

        public void fly(){
            System.out.println("分成3个");
        }
    }

    public static class Bird {
        public void fly(){

        }
    }
}
