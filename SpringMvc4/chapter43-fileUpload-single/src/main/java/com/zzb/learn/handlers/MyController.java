package com.zzb.learn.handlers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;


@Controller
@RequestMapping("/test")
public class MyController {

    @RequestMapping("/upload.do")
    public String doUpload(HttpServletRequest httpServletRequest, MultipartFile img) throws Exception {
//        String path = "/home/gavin/images";
        String path = httpServletRequest.getSession().getServletContext().getRealPath("/images");
        String fileName = img.getOriginalFilename();
        System.out.println(fileName);
        httpServletRequest.setAttribute("message", "upload failed !");
        if (fileName.endsWith("jpg")) {
            File file = new File(path, fileName);
            img.transferTo(file);
            httpServletRequest.setAttribute("message", "upload success !");
        }
        System.out.println(path);
        return "/WEB-INF/jsp/message.jsp";
    }
}
