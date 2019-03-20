package com.zzb.learn.dao;

public class Student {
    private int age;
    private String name;
    private String school;

    public Student() {
        System.out.println("==================================");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}

