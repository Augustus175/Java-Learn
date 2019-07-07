package com.zzb.spring;

import com.zzb.spring.request.MyRequest;
import com.zzb.spring.respone.MyResponse;
import com.zzb.spring.servlet.MyServlet;
import com.zzb.spring.servlet.ServletMapping;
import com.zzb.spring.servlet.ServletMappingConfig;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class GavinCat {
    private int port = 8080;
    private Map<String, String> urlServletMap = new HashMap<String, String>();

    public GavinCat(int port) {
        this.port = port;
    }

    public void start() {
        initServletMapping();
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(this.port);
            System.out.println("Gavin's cat start ...");
            while (true) {
                Socket socket = serverSocket.accept();
                InputStream inputStream = socket.getInputStream();
                OutputStream outputStream = socket.getOutputStream();
                MyRequest request = new MyRequest(inputStream);
                MyResponse response = new MyResponse(outputStream);
                despatch(request, response);
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initServletMapping() {

        for (ServletMapping serveletMapping :
                ServletMappingConfig.servletMappings) {
            urlServletMap.put(serveletMapping.getUrl(), serveletMapping.getClazz());
        }
    }

    private void despatch(MyRequest request, MyResponse response) {
        String clazz = urlServletMap.get(request.getUrl());
        try {
            Class servletClass = Class.forName(clazz);
            MyServlet myServlet = (MyServlet) servletClass.newInstance();
            myServlet.service(request, response);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new GavinCat(8080).start();
    }
}
