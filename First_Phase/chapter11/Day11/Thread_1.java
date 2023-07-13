package Day11;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day11
 * @Author: Jove
 * @CreateTime: 2023-02-24  19:36
 * @Description: TODO
 */

import java.util.Random;

/**
 * 编写一个继承Thread类的方式实现多线程的程序，该类MyThread有两个属性：一个字符串WhoAmI代表线程名，
 * 一个整数delay代表该线程随机要休眠的时间。利用有参的构造函数指定线程名称和休眠时间，休眠时间为随机数，
 * 线程执行时，会显示线程名，和要休眠时间。最后，在main()方法中创建三个线程对象以展示执行情况。
 */
public class Thread_1 {
    public static void main(String[] args) {
        Random random = new Random();
        MyThread myThread1 = new MyThread("线程1",((int) (random.nextDouble() * 10000.0)));
        MyThread myThread2 = new MyThread("线程1",((int) (random.nextDouble() * 10000.0)));
        MyThread myThread3 = new MyThread("线程1",((int) (random.nextDouble() * 10000.0)));
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}

class MyThread extends Thread{
    private String WhoAmI;
    private int delay;

    public MyThread(String whoAmI, int delay) {
        WhoAmI = whoAmI;
        this.delay = delay;
    }

    @Override
    public synchronized void run() {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+":"+delay);
    }
}


