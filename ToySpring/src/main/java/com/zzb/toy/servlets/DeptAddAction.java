package com.zzb.toy.servlets;

import com.zzb.toy.service.BaseService;
import com.zzb.toy.util.ReflectUtil;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeptAddAction extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("accept success !!");
//        request.getParameter("")
        BaseService baseService = null;
        try {
            baseService = ReflectUtil.createService(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        baseService.save();
        request.getRequestDispatcher("/success.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
