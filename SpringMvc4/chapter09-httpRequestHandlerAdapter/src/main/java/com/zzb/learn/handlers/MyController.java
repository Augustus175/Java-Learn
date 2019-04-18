package com.zzb.learn.handlers;


import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyController implements HttpRequestHandler {

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("message", "hello spring mvc");
        request.getRequestDispatcher("/WEB-INF/jsp/welcome.jsp").forward(request, response);
    }
    //    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("message", "hello spring mvc");
//        modelAndView.setViewName("/WEB-INF/jsp/welcome.jsp");
//        modelAndView.setViewName("welcome");
//        return modelAndView;
//    }
}
