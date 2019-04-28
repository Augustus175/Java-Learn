package com.zzb.learn.handlers;


import com.zzb.learn.exceptions.AgeExceptions;
import com.zzb.learn.exceptions.NameExceptions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class MyController {

    @RequestMapping("/register.do")
    public String doRegister(String name, int age) throws Exception {
        if (!"a".equals(name)) {
            throw new NameExceptions("Error name");
        }
        if (age > 23) {
            throw new AgeExceptions("Error age");
        }
        return "/welcome.jsp";
    }
}
