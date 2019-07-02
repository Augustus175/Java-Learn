package com.zzb.learn.service;

import com.zzb.learn.bean.Student;

import java.util.List;
import java.util.Map;

public interface IStudentService {
   int saveStudent(Student student);


    List<Student> findStudentsByCondition(Student student);

    List<Student> findStudentsByConditionWhere(Student student);
}
