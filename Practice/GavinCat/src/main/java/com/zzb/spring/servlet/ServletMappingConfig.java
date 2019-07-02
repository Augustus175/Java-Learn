package com.zzb.spring.servlet;

import java.util.ArrayList;
import java.util.List;

public class ServletMappingConfig {
    public static List<ServletMapping> servletMappings = new ArrayList<ServletMapping>();

    static {
        servletMappings.add(new ServletMapping("teacher", "/teacher", "com.zzb.spring.servlet.TeacherServlet"));
        servletMappings.add(new ServletMapping("student", "/student", "com.zzb.spring.servlet.StudentServlet"));
        servletMappings.add(new ServletMapping("favicon", "/favicon", "com.zzb.spring.servlet.FaviconServlet"));
    }
}
