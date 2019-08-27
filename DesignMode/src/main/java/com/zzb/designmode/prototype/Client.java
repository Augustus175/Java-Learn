package com.zzb.designmode.prototype;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Plane> planes1 = new ArrayList<>();
        System.out.println("==========original==========");
        for (int i = 0; i < 5; i++) {
            Plane plane = new Plane(new Random().nextInt(200));
            planes1.add(plane);
        }
        System.out.println(planes1);
        System.out.println("==========prototype==========");

        List<Plane> planes2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Plane plane = PlaneFactory.getInstance(new Random().nextInt(200));
            planes2.add(plane);
        }
        System.out.println(planes2);
    }
}
