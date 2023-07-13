package Day08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Student2, String> hm = new HashMap<Student2, String>();

        Student2 s1 = new Student2("xiaohei", 23);
        Student2 s2 = new Student2("dapang", 22);
        Student2 s3 = new Student2("xiaomei", 22);

        hm.put(s1, "江苏");
        hm.put(s2, "北京");
        hm.put(s3, "天津");


        Set<HashMap.Entry<Student2,String>> s = hm.entrySet();

//        List<HashMap.Entry<Student2, String >> list = new ArrayList(hm.entrySet());
//        Collections.sort(list, (o1, o2) -> (o2.getValue().compareTo(o1.getValue())));
        //System.out.println("排序后新map:" + list);


        for(Map.Entry<Student2,String> mm : s){
            Student2 key = mm.getKey();
            String value = mm.getValue();
            System.out.println(key.getName() + "---" + key.getAge() + "---" + value);
        }
        Set<Student2> key=hm.keySet();
        for (Student2 s0 : key){
            String value=hm.get(s0);
            System.out.println(s0.getName()+","+s0.getAge()+","+value);
        }

    }
}
class Student2 {
    private String name;
    private int age;

    public Student2() {
    }

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}