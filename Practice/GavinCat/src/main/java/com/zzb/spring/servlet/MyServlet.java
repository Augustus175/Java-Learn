package com.zzb.spring.servlet;

import com.zzb.spring.request.MyRequest;
import com.zzb.spring.respone.MyResponse;

public abstract class MyServlet {
    protected abstract void doGet(MyRequest request, MyResponse response);

    protected abstract void doPost(MyRequest request, MyResponse response);

    public void service(MyRequest request, MyResponse response) throws NoSuchMethodException {
        if (request.getMethod().equalsIgnoreCase("POST")) {
            doPost(request, response);
        } else if (request.getMethod().equalsIgnoreCase("GET")) {
            doGet(request, response);
        } else {
            throw new NoSuchMethodException("NOT SUPPORT !!");
        }
    }
}
