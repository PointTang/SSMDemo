package com.point.spring2;

import java.util.List;

/**
 * Created by Point on 2017/6/12.
 */
public class Student {
    private long id;
    private String name;
    private List courses;
    private School school;

    public Student(long id, String name, List courses, School school) {
        this.id = id;
        this.name = name;
        this.courses = courses;
        this.school = school;
    }

    public void printInfo(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return id +" \n"+ name + " \n" + courses + " \n" + school;
    }
}
