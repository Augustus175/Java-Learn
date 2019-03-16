package com.zzb.learn.test;

import com.zzb.learn.bean.Student;
import com.zzb.learn.dao.IStudentDao;
import com.zzb.learn.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class MyTest {
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
    public void test1() {
        List<Student> students = dao.selectStudentById(1);
        for (Student st :
                students) {
            System.out.println(st);
        }
    }

}
