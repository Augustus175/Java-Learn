package com.zzb.learn.bean;


public class Minister {
    private int mid;
    private String mname;
    private Country country;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Minister{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", country=" + country +
                '}';
    }
}
