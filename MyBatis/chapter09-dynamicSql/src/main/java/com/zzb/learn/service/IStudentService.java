package com.zzb.learn.service;

import com.zzb.learn.bean.Student;

import java.util.List;
import java.util.Map;

public interface IStudentService {
    void saveStudent(Student student);


    List<Student> findStudentsByCondition(Student student);

}
