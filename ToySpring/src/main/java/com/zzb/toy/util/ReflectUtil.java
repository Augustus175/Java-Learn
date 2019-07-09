package com.zzb.toy.util;

import com.zzb.toy.dao.BaseDao;
import com.zzb.toy.service.BaseService;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Calendar;

public class ReflectUtil {

    public static BaseService createService(HttpServletRequest httpServletRequest) throws Exception {
        String uri = httpServletRequest.getRequestURI();
        int start = uri.lastIndexOf("/");
        int end = uri.indexOf(".action");
        String serviceId = uri.substring(start + 1, end);
        ServletContext application = httpServletRequest.getSession().getServletContext();
        String xmlPath = application.getRealPath("WEB-INF/config/beans-config.xml");
        InputStream in = new FileInputStream(xmlPath);
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(in);
        String xPath = "//bean[@id='" + serviceId + "']";
        Element beanObj = (Element) document.selectSingleNode(xPath);
        String classPath = beanObj.attributeValue("class");
        Class classObj = Class.forName(classPath);
        BaseService serviceObj = (BaseService) classObj.newInstance();
        application.setAttribute(serviceId, serviceObj);
        return serviceObj;
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
        ServletContext application = httpServletRequest.getSession().getServletContext();
        Object obj = application.getAttribute(serviceId);
        if (null == obj) {
            return null;
        } else {
            return (BaseService) obj;
        }
    }

    public static void initDao(BaseService service, HttpServletRequest request) throws Exception {
        Class classObj = service.getClass();
        ServletContext application = request.getSession().getServletContext();
        String xmlPath = application.getRealPath("WEB-INF/config/beans-config.xml");
        InputStream in = new FileInputStream(xmlPath);
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(in);
        String classPath = classObj.getName();
        String xPath = "//bean[@id='" + classPath + "']";
        Element beanObj = (Element) document.selectSingleNode(xPath);
        Element propertyObj = beanObj.element("property");
        String fieldName = propertyObj.attributeValue("name");
        String daoId = propertyObj.attributeValue("ref");
        xPath = "//bean[@id='" + daoId + "']";
        beanObj = (Element) document.selectSingleNode(xPath);
        String daoClassPath = beanObj.attributeValue("class");
        Class daoClassObj = Class.forName(daoClassPath);
        BaseDao daoObj = (BaseDao) daoClassObj.newInstance();
        Field fieldObj = classObj.getDeclaredField(fieldName);
        fieldObj.setAccessible(true);
        fieldObj.set(service, daoObj);
    }
}
