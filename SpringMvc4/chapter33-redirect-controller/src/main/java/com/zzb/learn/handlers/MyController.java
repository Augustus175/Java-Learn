package com.zzb.learn.handlers;


import com.zzb.learn.dto.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class MyController {

    @RequestMapping("/register.do")
    public String doRegister(Student student, Model model) {
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        System.out.println("student = " + student);
        return "redirect:other.do";
    }

    @RequestMapping("/other.do")
    public String doOther(String name, int age) {
        System.out.println("name = " + name);
        System.out.println("age= " + age);
        return "/welcome.jsp";
    }
}
