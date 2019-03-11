package com.zzb.learn.dao;

import com.zzb.learn.bean.Student;
import com.zzb.learn.utils.MyBatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class StudentDaoImpl implements IStudentDao {

    private SqlSession sqlSession;

    @Override
    public void insertStudent(Student student) {

        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = sqlSessionFactory.openSession();
            sqlSession.insert("insertStu", student);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (sqlSession != null) {
            sqlSession.close();
        }

    }
}
