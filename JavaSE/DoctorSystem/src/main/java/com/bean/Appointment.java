package com.bean;

import java.time.LocalDateTime;

/**
 * @BelongsProject: JavaSE
 * @BelongsPackage: com.bean
 * @Author: Jove
 * @CreateTime: 2023-07-28  11:29
 * @Description: TODO
 */

public class Appointment {
    // 包含预约时间、患者信息、所选医生、状态等属性
    private String userName;
    private char sex;
    private int age;
    private String tel;
    private String desc;
    private String departName;
    private String doctorId;
    private LocalDateTime appointDateTime;

    @Override
    public String toString() {
        return "Appointment{" +
                "userName='" + userName + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", tel='" + tel + '\'' +
                ", desc='" + desc + '\'' +
                ", departName='" + departName + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", appointDateTime=" + appointDateTime +
                '}';
    }

    public Appointment(String userName, char sex, int age, String tel, String desc, String departName, String doctorId, LocalDateTime appointDateTime) {
        this.userName = userName;
        this.sex = sex;
        this.age = age;
        this.tel = tel;
        this.desc = desc;
        this.departName = departName;
        this.doctorId = doctorId;
        this.appointDateTime = appointDateTime;
    }

    public Appointment() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public LocalDateTime getAppointDateTime() {
        return appointDateTime;
    }

    public void setAppointDateTime(LocalDateTime appointDateTime) {
        this.appointDateTime = appointDateTime;
    }
}


