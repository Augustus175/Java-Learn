package com.zzb.learn.test;

import com.zzb.learn.bean.Student;
import com.zzb.learn.dao.IStudentDao;
import com.zzb.learn.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

import static org.testng.Assert.*;

public class IStudentDaoTest {
    private IStudentDao dao;
    private SqlSession sqlSession;


    @BeforeTest
    public void befor() {
        try {
            sqlSession = MyBatisUtil.getSqlSession();
            dao = sqlSession.getMapper(IStudentDao.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInsertStudent() {
    }

    @Test
    public void testSelectStudentsByConditionIf() {
    }

    @Test
    public void testSelectStudentsByConditionWhere() {
//        Student student = new Student("四", 23, -1);
//        Student student = new Student("四", -1, -1);
        Student student = new Student("", -1, -1);
        List<Student> students = dao.selectStudentsByConditionWhere(student);
        for (Student stu :
                students) {
            System.out.println(stu);
        }
    }
}