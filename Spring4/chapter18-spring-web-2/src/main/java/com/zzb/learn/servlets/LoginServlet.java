package com.zzb.learn.servlets;

import com.zzb.learn.beans.Student;
import com.zzb.learn.service.IStudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {

    private IStudentService studentService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        Integer age = Integer.parseInt(request.getParameter("age"));
        Student student = new Student(name, age);
        System.out.println(student);
//        String contextKey = WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
//        ApplicationContext applicationContext = (ApplicationContext) this.getServletContext().getAttribute(contextKey);
        WebApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        System.out.println("===>>> applicationContext: " + applicationContext);
        studentService = (IStudentService) applicationContext.getBean("studentService");
        studentService.saveStudent(student);
        request.getRequestDispatcher("/welcome.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
