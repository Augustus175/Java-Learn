package com.zzb.learn.dao;

public class Person {
    private int page;
    private String pname;

    public Person() {
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int compareAge() {
        return this.page > 25 ? 25 : this.page;
    }

    @Override
    public String toString() {
        return "Person{" +
                "page=" + page +
                ", pname='" + pname + '\'' +
                '}';
    }
}

