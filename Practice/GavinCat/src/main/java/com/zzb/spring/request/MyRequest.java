package com.zzb.spring.request;

import java.io.IOException;
import java.io.InputStream;

public class MyRequest {
    private String url;
    private String method;

    public MyRequest() {
    }

    public MyRequest(InputStream inputStream) throws IOException {
        StringBuilder httpRequest = new StringBuilder();
        byte[] httpRequestByte = new byte[1024];
        int length = 0;
        if ((length = inputStream.read(httpRequestByte)) >= 0) {
            httpRequest.append(new String(httpRequestByte, 0, length));
        }
        System.out.println("httpRequest is : " + httpRequest);
        if (httpRequest.length() != 0) {
            String httpHead = httpRequest.toString().split("\n")[0];
            url = httpHead.split("\\s")[1];
            method = httpHead.split("\\s")[0];
            System.out.println("MyRequest is : " + this);
        } else {
            System.out.println("Wrong request!");
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return "MyRequest{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                '}';
    }
}
