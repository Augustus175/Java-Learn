package com.zzb.designmode.adapter;

public class TV implements DualPin {
    @Override
    public void electricfy(int l, int n) {
        System.out.println("live line is : " + l);
        System.out.println("null line is : " + n);
    }
}
