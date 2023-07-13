package Day10;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day10
 * @Author: Jove
 * @CreateTime: 2023-02-24  14:24
 * @Description: TODO
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DirCopyer {
    public static void main(String[] args) throws IOException {
        dirCopy("D:\\复制的文件","D:\\复制的文件1");
    }

    private static void dirCopy(String srcDir, String destDir) throws IOException {
        //根据源路径
        File srcFile = new File(srcDir);

        //根据目标路径构建目标根路径（如果不存在根路径，则自建根路径）
        File destFile = new File(destDir);
        if(!destFile.exists()) {
            destFile.mkdir();
        }

        //获取当前文件夹下的子文件夹
        File[] files = srcFile.listFiles();
        for(File eleFile : files) {
            //如果是文件夹
            if(eleFile.isDirectory()) {
                //获取源文件夹目录
                String subSrcDir  = eleFile.getAbsolutePath();
                //获取目的文件夹目录
                String subDestDir = destDir + File.separator + eleFile.getName();
                //新建当前文件夹（避免）
                new File(subDestDir).mkdir();
                //构建子文件夹，并递归复制其中的内容（包括文件目录）
                dirCopy(subSrcDir,subDestDir);
            }

            //如果是文件（则直接拷贝文件）
            if(eleFile.isFile()) {
                InputStream ips    = null;
                OutputStream ops = null;
                try {
                    //源文件路径
                    ips  = new FileInputStream(eleFile);
                    //目标文件（）
                    ops = new FileOutputStream(destDir + File.separator + eleFile.getName());
                    int len = 0;
                    byte[] buf = new byte[1024];
                    while((len=ips.read(buf))>0) {
                        ops.write(buf, 0, len);
                    }
                } finally {
                    if(null!=ips) {
                        ips.close();
                    }
                    if(null!=ops) {
                        ops.close();
                    }
                }
            }
        }
    }
}


