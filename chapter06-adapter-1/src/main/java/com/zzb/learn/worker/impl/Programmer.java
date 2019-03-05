package com.zzb.learn.worker.impl;

import com.zzb.learn.worker.IProgrammer;

public class Programmer implements IProgrammer {
    @Override
    public void program() {
        System.out.println("programing now !");
    }
}
