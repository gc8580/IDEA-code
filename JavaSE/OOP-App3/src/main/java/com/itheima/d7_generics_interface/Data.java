package com.itheima.d7_generics_interface;

import java.util.ArrayList;

// 泛型接口
public interface Data<T> {
//public interface Data<T extends Animal> {
    void add(T t);
    ArrayList<T> getByName(String name);
}
