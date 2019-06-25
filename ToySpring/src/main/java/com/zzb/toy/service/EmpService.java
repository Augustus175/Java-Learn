package com.zzb.toy.service;

public class EmpService implements BaseService {
    public String save() {
        System.out.println("-------run EmpService-------");
        return "success.jsp";
    }
}
