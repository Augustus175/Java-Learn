package com.zzb.toy.util;

import com.zzb.toy.service.BaseService;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.InputStream;

public class ReflectUtil {

    public static BaseService createService(HttpServletRequest httpServletRequest) throws Exception {
        String uri = httpServletRequest.getRequestURI();
        int start = uri.lastIndexOf("/");
        int end = uri.indexOf(".action");
        String serviceId = uri.substring(start + 1, end);
        String xmlPath = httpServletRequest.getSession().getServletContext().getRealPath("WEB-INF/config/beans-config.xml");
        System.out.println(xmlPath);
        InputStream in = new FileInputStream(xmlPath);
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(in);
        String xPath = "//bean[@id='" + serviceId + "']";
        System.out.println("xPath is " + xmlPath);
        Element beanObj = (Element) document.selectSingleNode(xPath);
        String classPath = beanObj.attributeValue("class");
        System.out.println("class Path is " + classPath);
        Class classObj = Class.forName(classPath);
        return (BaseService) classObj.newInstance();
    }
}
