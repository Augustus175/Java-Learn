package com.zzb.learn.worker.impl;

import com.zzb.learn.worker.ICooker;

public class Cooker implements ICooker {
    @Override
    public void cook() {
        System.out.println("cooking now !");
    }
}
