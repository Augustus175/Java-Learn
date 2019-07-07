package com.zzb.spring.servlet;

import com.zzb.spring.request.MyRequest;
import com.zzb.spring.respone.MyResponse;

import java.io.IOException;

public class StudentServlet extends MyServlet {
    @Override
    protected void doGet(MyRequest request, MyResponse response) {
        try {
            response.write("I am a Student!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(MyRequest request, MyResponse response) {
        try {
            response.write("I am a Student!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
