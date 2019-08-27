package com.zzb.designmode.prototype;

public class Plane implements Cloneable {
    private int x;
    private int y;
    private Bullet bullet = new Bullet();

    public Plane(int x) {
        this.x = x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    public void fly() {
        this.y++;
    }

    @Override
    protected Plane clone() throws CloneNotSupportedException {
        Plane plane = (Plane) super.clone();
        plane.setBullet(this.bullet.clone());
        return plane;
    }

    @Override
    public String toString() {
        return "I am a plane : " +
                "x is " + this.x +
                " y is " + this.y +
                " bullet is " + bullet;
    }
}
