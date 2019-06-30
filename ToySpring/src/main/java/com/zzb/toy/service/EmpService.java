package com.zzb.toy.service;

public class EmpService extends ContextAction implements BaseService {
    public String save() {
        System.out.println("-------run EmpService save-------");
        return "success.jsp";
    }

    public String delete() {
        System.out.println("param : " + request.getParameter("param"));
        System.out.println("-------run EmpService delete-------");
        return "success.jsp";
    }
}
