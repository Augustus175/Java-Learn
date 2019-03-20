package com.zzb.learn.dao;

public class Teacher {
    private String name;
    private int workAge;
    private String school;

    public Teacher() {
        System.out.println("----------------------------------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "workAge=" + workAge +
                ", name='" + name + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}

