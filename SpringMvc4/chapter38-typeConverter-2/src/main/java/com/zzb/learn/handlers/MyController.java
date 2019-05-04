package com.zzb.learn.handlers;


import org.springframework.beans.TypeMismatchException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@Controller
@RequestMapping("/test")
public class MyController {

    @RequestMapping("/register.do")
    public ModelAndView doRegister(Integer age, Date birthday) {
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("birthday = " + birthday);
        System.out.println("age = " + age);

        modelAndView.addObject("birthday", birthday);
        modelAndView.addObject("age", age);
        modelAndView.setViewName("/WEB-INF/jsp/welcome.jsp");
        return modelAndView;
    }

    @ExceptionHandler(TypeMismatchException.class)
    public ModelAndView handleException(HttpServletRequest httpServletRequest, Exception ex) {
        ModelAndView modelAndView = new ModelAndView();
        String age = httpServletRequest.getParameter("age");
        String birthday = httpServletRequest.getParameter("birthday");
        System.out.println(ex.getMessage());
        if (ex.getMessage().contains(age)) {
            modelAndView.addObject("ageError", "Error Age !");
        }
        if (ex.getMessage().contains(birthday)) {
            modelAndView.addObject("birthdayError", "Error Birthday !");
        }
        modelAndView.addObject("age", age);
        modelAndView.addObject("birthday", birthday);
        modelAndView.addObject("ex", ex);
        modelAndView.setViewName("/index.jsp");
        return modelAndView;
    }
}
