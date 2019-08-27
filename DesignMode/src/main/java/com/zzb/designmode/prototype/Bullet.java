package com.zzb.designmode.prototype;

public class Bullet implements Cloneable {
    @Override
    protected Bullet clone() throws CloneNotSupportedException {
        return (Bullet) super.clone();
    }

    @Override
    public String toString() {
        return " I am a bullet : " + super.toString();
    }
}
