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
    public List<Student> findStudentsByCondition(Student student) {
        return dao.selectStudentsByCondition(student);
    }

}
