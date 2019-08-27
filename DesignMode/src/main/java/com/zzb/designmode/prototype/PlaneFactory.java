package com.zzb.designmode.prototype;

public class PlaneFactory {
    private static Plane protoPlane = new Plane(200);

    public static Plane getInstance(int x) throws CloneNotSupportedException {
        Plane clone = protoPlane.clone();
        clone.setX(x);
        return clone;
    }
}
