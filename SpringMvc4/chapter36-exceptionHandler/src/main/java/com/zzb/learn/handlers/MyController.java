package com.zzb.learn.handlers;


import com.zzb.learn.exceptions.AgeExceptions;
import com.zzb.learn.exceptions.NameExceptions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

    @ExceptionHandler(NameExceptions.class)
    public ModelAndView resolveNameException(Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", ex);
        mv.setViewName("/errorpages/nameErrors.jsp");
        return mv;
    }

    @ExceptionHandler(AgeExceptions.class)
    public ModelAndView resolveAgeException(Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", ex);
        mv.setViewName("/errorpages/ageErrors.jsp");
        return mv;
    }

    @ExceptionHandler
    public ModelAndView resolveException(Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", ex);
        mv.setViewName("/errorpages/errors.jsp");
        return mv;
    }
}
