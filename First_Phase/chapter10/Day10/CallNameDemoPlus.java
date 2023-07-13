package Day10;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day10
 * @Author: Jove
 * @CreateTime: 2023-02-24  17:41
 * @Description: TODO
 */


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;

public class CallNameDemoPlus {
    public static int count;
    public static void main(String[] args) {
        try (
                // 名称文本流入 相对路径
                Reader fr = new FileReader("chapter10//Name.txt");
                // 缓冲管道
                BufferedReader br = new BufferedReader(fr);
        ){
            // 集合获取每个同学的名称并加入
            List<String> list = new ArrayList<>();
            String str;
            while ((str = br.readLine()) != null){
                list.add(str);
            }
            // properties记录程序运行几次
            Properties properties = new Properties();
            // 加载运行次数数据
            properties.load(new FileReader("chapter10//Day10//scratch.properties"));
            // 获取键值--次数
            String value = properties.getProperty("time");
            // 将存在的次数值赋给count（后续也可以直接使用value，不过value是字符串，不太方便）
            if (value != null){
                count = Integer.parseInt(value);
            }
            System.out.println("第" + count +"次运行时随机的姓名");
            // 要求第三次必须是张三回答问题
            if (count == 3){
                System.out.println("恭喜您，张三同学被选中啦~~,必须是你哦");
            }else{
                // 其它情况，任意随机同学
                Random r = new Random();
                System.out.println("恭喜您," + list.get(r.nextInt(list.size())) + "同学被选中啦");
            }
            // 每次点名结束，次数加1
            count++;
            // 将新数据更新，保存
            properties.setProperty("time", count+"");
            properties.store(new FileWriter("chapter10//Day10//scratch.properties"), "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


