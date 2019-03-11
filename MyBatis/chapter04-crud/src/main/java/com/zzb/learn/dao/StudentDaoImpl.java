package com.zzb.learn.dao;

import com.zzb.learn.bean.Student;
import com.zzb.learn.utils.MyBatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class StudentDaoImpl implements IStudentDao {

    private SqlSession sqlSession;
    private InputStream inputStream;

    @Override
    public void insertStudent(Student student) {

        inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis.xml");
            sqlSession = MyBatisUtil.getSqlSession();
            sqlSession.insert("insertStudent", student);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    @Override
    public void insertStudentCatchId(Student student) {
        try {
            inputStream = Resources.getResourceAsStream("mybatis.xml");
            sqlSession = MyBatisUtil.getSqlSession();
            sqlSession.insert("insertStudentCatchId", student);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (sqlSession != null) {
            sqlSession.close();
        }

    }

    @Override
    public void deleteStudentById(Integer id) {
        try {
            inputStream = Resources.getResourceAsStream("mybatis.xml");
            sqlSession = MyBatisUtil.getSqlSession();
            sqlSession.delete("deleteStudentById", id);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    @Override
    public void updateStudent(Student student) {
        try {
            inputStream = Resources.getResourceAsStream("mybatis.xml");
            sqlSession = MyBatisUtil.getSqlSession();
            sqlSession.update("updateStudent", student);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (sqlSession != null) {
            sqlSession.close();
        }

    }

    @Override
    public List<Student> selectAllStudents() {
        List<Student> students = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis.xml");
            sqlSession = MyBatisUtil.getSqlSession();
            students = sqlSession.selectList("selectAllStudents");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (sqlSession != null) {
            sqlSession.close();
        }
        return students;
    }

    @Override
    public Student selectStudentById(Integer id) {
        Student student = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis.xml");
            sqlSession = MyBatisUtil.getSqlSession();
            student = sqlSession.selectOne("selectStudentById", id);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (sqlSession != null) {
            sqlSession.close();
        }
        return student;
    }

    @Override
    public List<Student> selectStudent(String name) {
        return null;
    }

    @Override
    public Map<String, Student> selectStudentMap(String name) {
        return null;
    }
}
