package com.zzb.toy.dao;

public class EmpDao implements BaseDao {
    public void save() {
        System.out.println("-------run the EmpDap save-------");
    }

    public void delete() {
        System.out.println("run the EmpDap delete()");
    }
}
