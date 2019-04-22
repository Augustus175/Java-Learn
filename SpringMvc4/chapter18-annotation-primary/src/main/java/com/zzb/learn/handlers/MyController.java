package com.zzb.learn.handlers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/test")
public class MyController {
    @RequestMapping("/first.do")
    public ModelAndView doFirst(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "doFirst()");
        modelAndView.setViewName("/WEB-INF/jsp/welcome.jsp");
//        modelAndView.setViewName("welcome");
        return modelAndView;
    }

    @RequestMapping("/other.do")
    public ModelAndView doOther(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "doOther()");
        modelAndView.setViewName("/WEB-INF/jsp/welcome.jsp");
//        modelAndView.setViewName("welcome");
        return modelAndView;
    }
}
