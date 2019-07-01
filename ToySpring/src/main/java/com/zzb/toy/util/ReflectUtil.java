package com.zzb.toy.util;

import com.sun.deploy.net.HttpRequest;
import com.zzb.toy.service.BaseService;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectUtil {

    public static BaseService createService(HttpServletRequest httpServletRequest) throws Exception {
        String uri = httpServletRequest.getRequestURI();
        int start = uri.lastIndexOf("/");
        int end = uri.indexOf(".action");
        String serviceId = uri.substring(start + 1, end);
        String xmlPath = httpServletRequest.getSession().getServletContext().getRealPath("WEB-INF/config/beans-config.xml");
        InputStream in = new FileInputStream(xmlPath);
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(in);
        String xPath = "//bean[@id='" + serviceId + "']";
        Element beanObj = (Element) document.selectSingleNode(xPath);
        String classPath = beanObj.attributeValue("class");
        Class classObj = Class.forName(classPath);
        return (BaseService) classObj.newInstance();
    }

    public static String invoke(BaseService serviceObject, HttpServletRequest request) throws Exception {
        String methodName = request.getParameter("methodName");
        Class classObject = serviceObject.getClass();
        Method methodObject = classObject.getDeclaredMethod(methodName, null);
        return (String) methodObject.invoke(serviceObject, null);
    }

    public static void initRequest(BaseService service, HttpServletRequest httpRequest) throws Exception {
        Class serviceClass = service.getClass();
        Field field = serviceClass.getField("request");
        field.setAccessible(true);
        field.set(service, httpRequest);
    }

    public static BaseService getService(HttpServletRequest httpServletRequest) {
        String uri = httpServletRequest.getRequestURI();
        int start = uri.lastIndexOf("/");
        int end = uri.indexOf(".action");
        String serviceId = uri.substring(start + 1, end);
    }
}
