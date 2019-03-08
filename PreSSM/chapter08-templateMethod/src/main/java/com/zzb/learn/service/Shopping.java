package com.zzb.learn.service;

public abstract class Shopping {
    public void shopping() {
        login();
        choose();
        pay();
    }

    public final void login() {
        System.out.println("Login now !");
    }

    public abstract void choose();

    public void pay() {
        System.out.println("paying by wechat !");
    }
}

