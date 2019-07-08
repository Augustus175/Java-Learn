package com.zzb.toy.service;

import com.zzb.toy.dao.BaseDao;

public class EmpService extends ContextAction implements BaseService {
    private BaseDao dao;

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
