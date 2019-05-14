package com.zzb.learn.handlers;

import com.zzb.learn.beans.Student;
import com.zzb.learn.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class MyController {
    @Autowired
    @Qualifier("studentService")
    private IStudentService service;

    @RequestMapping("register.do")
    public String handleRequest(Student student) {
        service.saveStudent(student);
        return "/welcome.jsp";
    }

}
