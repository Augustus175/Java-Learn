package com.zzb.learn.test;

import com.zzb.learn.bean.NewsLabel;
import com.zzb.learn.dao.INewsLabelDao;
import com.zzb.learn.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class MyTest {
    private INewsLabelDao dao;
    private SqlSession sqlSession;


    @BeforeTest
    public void befor() {
        try {
            sqlSession = MyBatisUtil.getSqlSession();
            dao = sqlSession.getMapper(INewsLabelDao.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1() {
        List<NewsLabel> children = dao.selectChildrenById(2);
        for (NewsLabel newsLabel :
                children) {
            System.out.println(newsLabel);
        }
    }

}
