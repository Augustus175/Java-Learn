package com.zzb.learn.handlers;


import com.alibaba.fastjson.JSONObject;
import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class MyController {

    @RequestMapping("/myAjax.do")
    public void doAjax(@RequestParam Map<String, Object> map, HttpServletResponse response) throws Exception {
        System.out.println(map);
        JSONObject jsonObject = new JSONObject(map);
        String joString = jsonObject.toJSONString();
        System.out.println(joString);
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        writer.print(joString);
//        return "welcome";
    }
}
