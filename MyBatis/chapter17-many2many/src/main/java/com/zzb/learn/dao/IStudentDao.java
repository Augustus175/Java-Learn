package com.zzb.learn.dao;

import com.zzb.learn.bean.Student;

import java.util.List;

public interface IStudentDao {
    List<Student> selectStudentById(int id);
}
