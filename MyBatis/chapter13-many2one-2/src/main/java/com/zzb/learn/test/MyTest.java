package com.zzb.learn.test;

import com.zzb.learn.bean.Minister;
import com.zzb.learn.dao.IMinisterDao;
import com.zzb.learn.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class MyTest {
    private IMinisterDao dao;
    private SqlSession sqlSession;


    @BeforeTest
    public void befor() {
        try {
            sqlSession = MyBatisUtil.getSqlSession();
            dao = sqlSession.getMapper(IMinisterDao.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1() {
        Minister minister = dao.selectMinisterById(1);
        System.out.println(minister);
    }
}
