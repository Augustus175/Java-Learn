package com.zzb.learn.test;

import com.zzb.learn.bean.Student;
import com.zzb.learn.dao.IStudentDao;
import com.zzb.learn.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
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
        Student student = new Student("四", 23);
//        Student student = new Student("四", -1, -1);
//        Student student = new Student("", -1, -1);
        List<Student> students = dao.selectStudentsByConditionWhere(student);
        for (Student stu :
                students) {
            System.out.println(stu);
        }
    }

    @Test
    public void testSelectStudentsByConditionChoose() {
//        Student student = new Student("四", 23, -1);
//        Student student = new Student("四", -1, -1);
        Student student = new Student("", 23);
//        Student student = new Student("", -1, -1);
        List<Student> students = dao.selectStudentsByConditionChoose(student);
        for (Student stu :
                students) {
            System.out.println(stu);
        }
    }

    @Test
    public void testSelectStudentsByConditionForeach() {
        int[] ids = {1, 2, 3};
//        int[] ids = {};
        List<Student> students = dao.selectStudentsByConditionForeach(ids);
        for (Student stu :
                students) {
            System.out.println(stu);
        }
    }

    @Test
    public void testSelectStudentsByConditionForeach2() {
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        List<Student> students = dao.selectStudentsByConditionForeach2(ids);
        for (Student stu :
                students) {
            System.out.println(stu);
        }
    }

    @Test
    public void testSelectStudentsByConditionForeach3() {
        Student s1 = new Student();
        s1.setId(1);
        Student s2 = new Student();
        s2.setId(2);
        Student s3 = new Student();
        s3.setId(3);
        List<Student> stus = new ArrayList<>();
        stus.add(s1);
        stus.add(s2);
        stus.add(s3);
        List<Student> students = dao.selectStudentsByConditionForeach3(stus);
        for (Student stu :
                students) {
            System.out.println(stu);
        }
    }

    @Test
    public void testSelectStudentsByConditionFragment() {
        Student s1 = new Student();
        s1.setId(1);
        Student s2 = new Student();
        s2.setId(2);
        Student s3 = new Student();
        s3.setId(3);
        List<Student> stus = new ArrayList<>();
        stus.add(s1);
        stus.add(s2);
        stus.add(s3);
        List<Student> students = dao.selectStudentsByConditionFragment(stus);
        for (Student stu :
                students) {
            System.out.println(stu);
        }
    }
}