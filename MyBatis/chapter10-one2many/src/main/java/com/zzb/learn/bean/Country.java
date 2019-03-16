package com.zzb.learn.bean;

import java.util.List;

public class Country {
    private int cid;
    private String cname;
    private List<Minister> ministers;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<Minister> getMinisters() {
        return ministers;
    }

    public void setMinisters(List<Minister> ministers) {
        this.ministers = ministers;
    }

    @Override
    public String toString() {
        return "Country{" +
                "cid=" + cid +
                ", cname=" + cname +
                ", ministers=" + ministers +
                '}';
    }
}
