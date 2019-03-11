package com.zzb.learn.test;


import com.zzb.learn.bean.Student;
import com.zzb.learn.service.IStudentService;
import com.zzb.learn.service.StudentServiceImpl;
import org.testng.annotations.Test;


public class Mytest {
    @Test
    public void save() {
        Student student = new Student("张三", 23, 93.6);
        IStudentService service = new StudentServiceImpl();
        service.saveStudent(student);
    }
}
