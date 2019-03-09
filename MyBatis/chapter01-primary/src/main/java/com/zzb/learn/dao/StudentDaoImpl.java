package com.zzb.learn.dao;

import com.zzb.learn.bean.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class StudentDaoImpl implements IStudentDao {

    private SqlSession sqlsession;

    @Override
    public void insertStudent(Student student) {

        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlsession = sqlSessionFactory.openSession();
            sqlsession.insert("insertStu", student);
            sqlsession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (sqlsession != null) {
            sqlsession.close();
        }

    }
}
