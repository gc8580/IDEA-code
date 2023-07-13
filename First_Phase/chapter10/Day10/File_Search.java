package Day10;

import java.io.File;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day10
 * @Author: Jove
 * @CreateTime: 2023-02-23  20:11
 * @Description: TODO
 */

public class File_Search {
    public static void main(String[] args) {
        // 需求：去D盘搜索2055376.jpg文件
        searchFile(new File("D:/"), "2055376.jpg");
        /*
            文件存在，路径名称：D:\360Downloads\2055376.jpg
            文件存在，路径名称：D:\sss2055376.jpg
         */

    }

    public static void searchFile(File dir, String fileName) {
        // 判断是否是文件夹
        if (dir != null&& dir.isDirectory()) {
            File[] fileArray = dir.listFiles();
            // 判断文件数组中是否不为null且有内容(数组为null时，增强for循环报错空值异常)
            if (fileArray != null&& fileArray.length > 0) {
                for (File file : fileArray) {
                    // 判断是否是文件
                    if (file.isFile()) { // 是文件，判断是否是被搜索的文件
                        if (file.getName().contains(fileName)) {
                            System.out.println("文件存在，路径名称：" + file.getAbsolutePath());
                        }
                    } else { // 否则为文件夹，调用递归方法searchFile继续向下搜索
                        searchFile(file, fileName);
                    }
                }
            }
        } else {
            System.out.println("当前搜索的位置不是文件夹！");
        }
    }
}


