package Day10;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day10
 * @Author: Jove
 * @CreateTime: 2023-02-24  09:38
 * @Description: 目标：学会使用字节流完成文件的复制（支持一切文件类型的复制）
 */


import java.io.*;

public class OutputStreamDemo {
    public static void main(String[] args) {
        try {
            //1.创建一个字节输入流管道与原视频接通
            InputStream is = new FileInputStream("D:\\video.mp4");
            //2.创建一个字节输出流管道与目标文件接通
            OutputStream os = new FileOutputStream("D:\\复制的文件\\new.avi");

            //3.定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len; //记录每次读取的字节数
            while ((len = is.read(buffer))!=-1 ){
                os.write(buffer,0, len);
            }
            System.out.println("复制完成了！！");

            //4.关闭流
            os.close();
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


