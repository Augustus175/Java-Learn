package com.zzb.learn.service01;

import com.zzb.learn.bean.Student;

import java.util.List;
import java.util.Map;

public interface IStudentService {
    void saveStudent(Student student);


    List<Student> findStudentsByCondition(String name,int age);

}
