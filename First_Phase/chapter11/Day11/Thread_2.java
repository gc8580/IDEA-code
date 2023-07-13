package Day11;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day11
 * @Author: Jove
 * @CreateTime: 2023-02-24  19:36
 * @Description: TODO
 */

/**
 * 利用多线程，同时输出10以内的奇数和偶数，以及当前运行的线程名称，输出数字完毕输出end。
 * 1.synchronized(obj){
 *     //同步代码块
 * }
 * 2.public synchronized void  run() {
 *  //同步方法
 * }
 */
public class Thread_2 {
    public static void main(String[] args) {
        MyRunnable1 myRunnable1 = new MyRunnable1();
        MyRunnable2 myRunnable2 = new MyRunnable2();
        new Thread(myRunnable1,"线程偶数：").start();
        new Thread(myRunnable2,"线程奇数：").start();
    }
}
//线程1   偶数
class MyRunnable1 implements Runnable{

    @Override
    public synchronized void  run() {
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //currentThread()方法是在Thread类的静态方法，可以返回当前正在执行的线程对象的引用
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
        System.out.println(Thread.currentThread().getName()+"end");
    }
}
//线程2    奇数
class MyRunnable2 implements Runnable{

    @Override
    public synchronized void run() {
        for (int i = 0; i <= 50; i++) {
            if (i % 2 != 0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //currentThread()方法是在Thread类的静态方法，可以返回当前正在执行的线程对象的引用
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
        System.out.println(Thread.currentThread().getName()+"end");
    }
}


