package com.zzb.learn.service;

import com.zzb.learn.bean.Student;
import com.zzb.learn.dao.IStudentDao;
import com.zzb.learn.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements IStudentService {
    private IStudentDao dao;
    private SqlSession sqlSession;

    public StudentServiceImpl() {
        try {
            sqlSession = MyBatisUtil.getSqlSession();
            dao = sqlSession.getMapper(IStudentDao.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveStudent(Student student) {
        try {
            dao.insertStudent(student);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @Override
    public void saveStudentCatchId(Student student) {
        try {
            dao.insertStudentCatchId(student);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @Override
    public void removeStudentById(Integer id) {
        try {
            dao.deleteStudentById(id);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @Override
    public void modifyStudent(Student student) {
        try {
            dao.updateStudent(student);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
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

}
