package com.zzb.learn.service01;

import com.zzb.learn.bean.Student;

import java.util.List;
import java.util.Map;

public interface IStudentService {
    void saveStudent(Student student);

    void saveStudentCatchId(Student student);

    void removeStudentById(Integer id);

    void modifyStudent(Student student);

    List<Student> findAllStudents();

    Student findStudentById(Integer id);

    List<Student> findStudentByName(String name);
}
