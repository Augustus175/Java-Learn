package com.zzb.toy.service;

public class DeptService extends ContextAction implements BaseService {
    public String save() {
        System.out.println("-------run DeptService save-------");
        return "success.jsp";
    }

    public String delete() {
        System.out.println("param : " + request.getParameter("param"));
        System.out.println("-------run DeptService delete-------");
        return "success.jsp";
    }
}
