package Day11;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day11
 * @Author: Jove
 * @CreateTime: 2023-02-24  19:40
 * @Description: TODO
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Thread_3 {
    private int n; // 打印n次
    private int state; // 保证顺序打印
    private Lock lock = new ReentrantLock();

    public Thread_3(int n) {
        this.n = n;
    }

    public void print(String name, int targetNum) {
        for(int i = 0; i < n; ) {
            // 加锁
            lock.lock();
            if(state % 3 == targetNum) {
                System.out.print(name);
                i++;
                state++;
            }
            // 释放锁
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Thread_3 threadPrint = new Thread_3(100); // 打印100次
        new Thread(()->{
            threadPrint.print("A", 0);
        }).start();
        new Thread(()->{
            threadPrint.print("B", 1);
        }).start();
        new Thread(()->{
            threadPrint.print("C", 2);
        }).start();
    }
}



