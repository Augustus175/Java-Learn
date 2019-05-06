package com.zzb.learn.handlers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;


@Controller
@RequestMapping("/test")
public class MyController {

    @RequestMapping("/upload.do")
    public String doUpload(MultipartFile img) throws Exception {
        System.out.println("=====1==========");
        String parth = "/home/gavin/images";
        System.out.println("=====2==========");
        String fileName = img.getOriginalFilename();
        System.out.println("=====3==========");
        File file = new File(parth, fileName);
        img.transferTo(file);
        return "/WEB-INF/jsp/welcome.jsp";
    }
}
