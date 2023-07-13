package Day05_1;
//对象创建和使用
//        定义丈夫类 Husband 和妻子类 Wife，丈夫类的属性包括：身份证号，姓名，出生日
//        期，妻子。妻子类的属性包括：身份证号，姓名，出生日期，丈夫。分别给这两个类提供构造
//        方法（无参数构造方法和有参数构造方法都要提供），编写测试程序，创建丈夫对象，然后再
//        创建妻子对象，丈夫对象关联妻子对象，妻子对象关联丈夫对象，要求能够输出这个“丈夫对
//        象”的妻子的名字，或者能够输出这个“妻子对象”的丈夫的名字。并且要求在程序中演示出空指针异常的效果

public class Demo05 {
    //丈夫类的属性包括：身份证号，姓名，出生日期，妻子。
        //主函数入口
        public static void main(String[] args){
            //该男子未婚
            husband h1 = new husband("45454255","Jackson","1997-6-2",null);
            //该女子未婚
            wife w1 =new wife("15646748","Julia","1998-5-4",null);
            //让他俩产生关系
            //他们之间必须互相绑定，否则为绑定的一方将会出现空指针异常
            h1.woman = w1;
            w1.man = h1;
            //输出丈夫对象妻子的姓名
            System.out.println(h1.name + "妻子的名字是：" + h1.woman.name1);
            //输出妻子对象丈夫的姓名
            System.out.println(w1.name1 + "丈夫的名字是：" + w1.man.name);
        }
    }
    class husband{
        //身份证号
        String idCard;
        //姓名
        String name;
        //出生日期
        String birth;
        //妻子
        wife woman;
        //无参数的构造函数
        public  husband(){
        }
        //有参数的构造函数
        public husband(String no,String s1,String s2,wife wo){
            idCard = no;
            name = s1;
            birth = s2;
            woman = wo;
        }
    }

    //妻子类的属性包括：身份证号，姓名，出生日期，丈夫。
    class wife{
        //身份证号
        String idCard1;
        //姓名
        String name1;
        //出生日期
        String birth1;
        //丈夫
        husband man;
        //无参数的构造函数
        public  wife(){
        }
        //有参数的构造函数
        public wife(String no1,String y1,String y2,husband h){
            idCard1 = no1;
            name1 = y1;
            birth1 = y2;
            man = h;
        }
    }
