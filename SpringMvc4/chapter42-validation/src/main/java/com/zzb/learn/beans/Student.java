package com.zzb.learn.beans;

import javax.validation.constraints.*;

public class Student {
    @NotNull(message = "name don't allow null !")
    @Size(min = 6 ,max = 12, message = "length of name must bettown {min} and {max}")
    private String name;
    @Min(value = 0,message = "score must more than {value}")
    @Max(value = 100,message = "score must less than {value}")
    private double score;
    @NotNull(message = "mobile don't allow null !")
    @Pattern(regexp = "^1[34578]\\d{9}$",message = "enter the right mobile!")
    private String mobile;

    public Student() {
    }

    public Student(String name, double score, String mobile) {
        this.name = name;
        this.score = score;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
