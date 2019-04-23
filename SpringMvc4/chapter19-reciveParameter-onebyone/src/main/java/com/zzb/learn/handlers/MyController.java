package com.zzb.learn.handlers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class MyController {

    @RequestMapping("/register.do")
    public ModelAndView doRegister(String name, Integer age) {
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("name = " + name);
        System.out.println("age = " + age);

        modelAndView.addObject("pname", name);
        modelAndView.addObject("page", age);
        modelAndView.setViewName("/WEB-INF/jsp/welcome.jsp");
        return modelAndView;
    }
}
