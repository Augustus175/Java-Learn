package com.zzb.learn.handlers;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "hello spring mvc");
//        modelAndView.setViewName("/WEB-INF/jsp/welcome.jsp");
        modelAndView.setViewName("welcome");
        return modelAndView;
    }
}
