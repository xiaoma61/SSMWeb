package com.xiaoma.service;

import com.xiaoma.entity.NEWS;

import java.util.List;

public interface NewsService {
    void insertByBatch(List<NEWS> news);
}
