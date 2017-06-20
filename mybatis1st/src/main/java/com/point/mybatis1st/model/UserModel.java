package com.point.mybatis1st.model;

/**
 * Created by Point on 2017/6/19.
 */
public class UserModel {
    private int id;
    private String nam;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String name) {
        this.nam = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User: " + id + " " + nam + " " + age;
    }
}
