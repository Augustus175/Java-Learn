package com.zzb.learn.handlers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;


@Controller
@RequestMapping("/test")
public class MyController {

    @RequestMapping("/some.do")
    public String doSome() {
        System.out.println("do MyController doSome()");
        return "/WEB-INF/jsp/message.jsp";
    }
}
