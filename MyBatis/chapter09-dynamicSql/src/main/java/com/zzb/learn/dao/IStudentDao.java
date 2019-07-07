package com.zzb.learn.dao;

import com.zzb.learn.bean.Student;

import java.util.List;
import java.util.Map;

public interface IStudentDao {

    int insertStudent(Student student);

    List<Student> selectStudentsByConditionIf(Student student);

    List<Student> selectStudentsByConditionWhere(Student student);

    List<Student> selectStudentsByConditionChoose(Student student);

    List<Student> selectStudentsByConditionForeach(int[] ids);

    List<Student> selectStudentsByConditionForeach2(List<Integer> ids);

    List<Student> selectStudentsByConditionForeach3(List<Student> students);

    List<Student> selectStudentsByConditionFragment(List<Student> students);

}
