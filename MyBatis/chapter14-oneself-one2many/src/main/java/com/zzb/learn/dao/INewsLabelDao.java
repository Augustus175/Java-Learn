package com.zzb.learn.dao;

import com.zzb.learn.bean.NewsLabel;

import java.util.List;


public interface INewsLabelDao {
    List<NewsLabel> selectChildrenByPid(int pid);
//    NewsLabel select(int id);
}
