package Day05_3;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day05_3
 * @Author: Jove
 * @CreateTime: 2023-02-23  16:45
 * @Description: TODO
 */

public class API {
    public static void main(String[] args) {

        int[] ages = {10, 20, 30, 40, 50};//定义一个静态初始化数组

        //调用方法
        printArray(ages);

        System.out.println("-----------------");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        printArray(numbers);//调用方法

        System.out.println("-----------------");

        int[] numbers1 = null;

        printArray(numbers1);
    }

    public static void printArray(int[] arr) {//定义打印数组的方法

        System.out.print("[");

        if (arr.length > 0) {

            for (int i = 0; i < arr.length; i++) {//遍历

                System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");//三元运算符节省代码量
            }
        }
        System.out.println("]");
    }
}


