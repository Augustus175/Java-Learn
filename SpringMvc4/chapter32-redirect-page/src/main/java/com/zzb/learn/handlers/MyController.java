package com.zzb.learn.handlers;


import com.zzb.learn.dto.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class MyController {

    @RequestMapping("/register.do")
    public ModelAndView doRegister(Student student) {
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("student = " + student);
        modelAndView.addObject("name", student.getName());
        modelAndView.addObject("age", student.getAge());
        modelAndView.setViewName("redirect:/welcome.jsp");
        return modelAndView;
    }
}
