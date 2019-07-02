package com.zzb.spring.servlet;

import com.zzb.spring.request.MyRequest;
import com.zzb.spring.respone.MyResponse;

import java.io.IOException;

public class FaviconServlet extends MyServlet {
    @Override
    protected void doGet(MyRequest request, MyResponse response) {
        try {
            response.write("Favicon");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(MyRequest request, MyResponse response) {
        try {
            response.write("Favicon");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
