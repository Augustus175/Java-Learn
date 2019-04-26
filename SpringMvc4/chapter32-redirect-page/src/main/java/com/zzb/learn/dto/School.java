package com.zzb.learn.dto;

public class School {
    private String sname;
    private String address;

    public School() {
    }

    public School(String sname, String address) {
        this.sname = sname;
        this.address = address;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "sname='" + sname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
