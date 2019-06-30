package com.zzb.toy.service;

public class DebtService extends ContextAction implements BaseService {
    public String save() {
        System.out.println("-------run DebtService save-------");
        return "success.jsp";
    }

    public String delete() {
        System.out.println("param : " + request.getParameter("param"));
        System.out.println("-------run DebtService delete-------");
        return "success.jsp";
    }
}
