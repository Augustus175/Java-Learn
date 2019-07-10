package com.zzb.toy.service;

import com.zzb.toy.dao.BaseDao;

public class EmpService extends ContextAction implements BaseService {
    private BaseDao dao;

    public String save() {
        System.out.println("-------run EmpService save-------");
        dao.save();
        return "success.jsp";
    }

    public String delete() {
        System.out.println("param : " + request.getParameter("param"));
        System.out.println("-------run EmpService delete-------");
        return "success.jsp";
    }

    public BaseDao getDao() {
        return dao;
    }

    public void setDao(BaseDao dao) {
        this.dao = dao;
    }
}
