package com.zzb.learn.test;

import com.zzb.learn.bean.Country;
import com.zzb.learn.dao.ICountryDao;
import com.zzb.learn.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class MyTest {
    private ICountryDao dao;
    private SqlSession sqlSession;


    @BeforeTest
    public void befor() {
        try {
            sqlSession = MyBatisUtil.getSqlSession();
            dao = sqlSession.getMapper(ICountryDao.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1() {
       Country country = dao.selectCountryById(1);
        System.out.println(country);
    }
}
