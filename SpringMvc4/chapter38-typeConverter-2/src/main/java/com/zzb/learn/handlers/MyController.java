package com.zzb.learn.handlers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
        modelAndView.addObject("page", age);
        modelAndView.setViewName("/WEB-INF/jsp/welcome.jsp");
        return modelAndView;
    }
}
