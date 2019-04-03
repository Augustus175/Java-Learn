package com.zzb.learn.dao;

import com.zzb.learn.beans.Student;

import java.util.List;
import java.util.Map;

public interface IStudentDao {
    void insertStudent(Student student);

    void insertStudentCatchId(Student student);

    void deleteStudentById(Integer id);

    void updateStudent(Student student);

    List<Student> selectAllStudents();

    Student selectStudentById(Integer id);

    List<Student> selectStudentByName(String name);

    Map<String, Student> selectStudentMap();

}
