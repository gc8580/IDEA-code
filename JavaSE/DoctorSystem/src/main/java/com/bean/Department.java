package com.bean;

import java.util.ArrayList;

/**
 * @BelongsProject: JavaSE
 * @BelongsPackage: com
 * @Author: Jove
 * @CreateTime: 2023-07-28  11:25
 * @Description: TODO
 */

public class Department {
    private String name;
    private ArrayList<Doctor> doctors = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public int getNumber(){
        return doctors.size();
    }

}


