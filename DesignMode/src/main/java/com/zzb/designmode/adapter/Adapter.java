package com.zzb.designmode.adapter;

public class Adapter implements TriplePin {
    private DualPin dualPin;

    public Adapter(DualPin dualPin) {
        this.dualPin = dualPin;
    }

    @Override
    public void electricfy(int l, int n, int e) {
        dualPin.electricfy(l, n);
    }
}
