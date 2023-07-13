package Day10;

import java.util.Scanner;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day10
 * @Author: Jove
 * @CreateTime: 2023-02-24  09:30
 * @Description: TODO
 */

public class recursion1 {
    public static void main(String args[]){

        while(true){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            System.out.println("sum="+sum(n));
        }
    }
    public static int sum(int n){
        if(n==1)
            return 1;
        else
            return n+sum(n-1);
    }
}


