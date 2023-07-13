package Day10;

import java.io.File;
import java.io.IOException;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day10
 * @Author: Jove
 * @CreateTime: 2023-02-23  20:13
 * @Description: TODO
 */

public class Delete {
    public static void main(String[] args) {
        //2、创建File对象dir,代表存在的文件夹
        File dir = new File("E:\\to\\day11");

        //3、调用步骤一中定义的deleteDir方法,传递File对象dir,完成文件夹的删除
        boolean result = deleteDir(dir);
        System.out.println("文件夹: "+dir.getAbsolutePath()+" 删除 "+(result?"成功":"失败")+"!");
    }

    //1、定义删除文件夹的方法deleteDir
    public static boolean deleteDir(File dir) {
        //1.1、获取源文件夹中的所有的文件和文件夹对应的File对象数组
        File[] files = dir.listFiles();

        //1.2、判断,如果File对象数组是null或者没有内容,删除目录,结束方法
        if (files == null || files.length == 0) {
            return dir.delete();
        }

        //1.3、遍历File对象数组
        for (File file : files) {
            //1.4、判断,如果当前File对象是文件,调用delete方法,删除文件
            if (file.isFile()) {
                file.delete();
            }
            if (file.isDirectory()) {
                //1.5、判断,如果当前File对象是文件夹,递归调用调用deleteDir方法,传递当前File对象
                deleteDir(file);
            }

        }
        //1.6、循环结束,删除调用方法传递的文件夹File对象
        return dir.delete();
    }
}


