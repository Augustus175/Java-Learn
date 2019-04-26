package com.zzb.learn.handlers;


import com.zzb.learn.dto.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/test")
public class MyController {

    @RequestMapping("/myAjax.do")
    @ResponseBody
    public Object doAjax() {
        Student student = new Student("张三", 23);
        return student;
    }
}
