package com.zzb.learn.resolvers;

import com.zzb.learn.exceptions.AgeExceptions;
import com.zzb.learn.exceptions.NameExceptions;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHandleExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", ex);
        mv.setViewName("/errorpages/errors.jsp");
        if (ex instanceof NameExceptions) {
            System.out.println("name error !!!");
            mv.setViewName("/errorpages/nameErrors.jsp");
        }
        if (ex instanceof AgeExceptions) {
            System.out.println("age error !!!");
            mv.setViewName("/errorpages/ageErrors.jsp");
        }
        return mv;
    }
}
