package com.zzb.learn.utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {

    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
        sqlSessionFactory = null;
        if (sqlSessionFactory == null) {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }
        return sqlSessionFactory.openSession();
    }
}
