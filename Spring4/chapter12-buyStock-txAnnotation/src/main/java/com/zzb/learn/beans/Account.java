package com.zzb.learn.beans;

public class Account {
    private Integer id;
    private String aname;
    private double balance;

    public Account() {
    }

    public Account(Integer id, String aname, double balance) {
        this.id = id;
        this.aname = aname;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", aname='" + aname + '\'' +
                ", balance=" + balance +
                '}';
    }
}
