package com.xiaoma.dao;

import com.xiaoma.entity.NEWS;

import java.util.List;

public interface NewsDao {
    //插入到数据库中
    void insertByBatch(List<NEWS> news);
    //查询所有新闻
    List<NEWS>findall();

}
