package com.xiaoma.service;

import com.xiaoma.entity.NEWS;

import java.util.List;

public interface NewsService {
    void insertByBatch(List<NEWS> news);
    //查询所有新闻
    List<NEWS> findall();
}
