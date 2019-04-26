package com.zzb.learn.handlers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/test")
public class MyController {

    @RequestMapping("/myAjax.do")
    @ResponseBody
    public Object doAjax() {
        return 123.456;
    }
}
