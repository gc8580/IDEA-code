package Day07;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day07
 * @Author: Jove
 * @CreateTime: 2023-02-23  19:43
 * @Description: TODO
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;

@Target({METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyTiger{
    String value() default "modify method";
}

class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


