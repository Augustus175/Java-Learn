package com.zzb.learn.service;

import com.zzb.learn.bean.Student;
import com.zzb.learn.dao.IStudentDao;
import com.zzb.learn.dao.StudentDaoImpl;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class StudentServiceImpl implements IStudentService {
    private IStudentDao dao;

    public StudentServiceImpl() {
        dao = new StudentDaoImpl();
    }

    @Override
    public void saveStudent(Student student) {
        dao.insertStudent(student);
    }

    @Override
    public void saveStudentCatchId(Student student) {
        dao.insertStudentCatchId(student);
    }

    @Override
    public void removeStudentById(Integer id) {
        dao.deleteStudentById(id);
    }

    @Override
    public void modifyStudent(Student student) {
        dao.updateStudent(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return dao.selectAllStudents();
    }

    @Override
    public Student findStudentById(Integer id) {
        return dao.selectStudentById(id);
    }

    @Override
    public List<Student> findStudentByName(String name) {
        return dao.selectStudentByName(name);
    }

    @Override
    public Map<String, Student> findStudentMap() {
        return dao.selectStudentMap();
    }
}
