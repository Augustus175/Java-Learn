package com.zzb.learn.dao;

import com.zzb.learn.bean.Student;

import java.util.List;
import java.util.Map;

public interface IStudentDao {

    void insertStudent(Student student);

    List<Student> selectStudentsByCondition(Map<String, Object> map);


}
