package com.xiaoma.service.serviceImpl;

import com.xiaoma.dao.NewsDao;
import com.xiaoma.entity.NEWS;
import com.xiaoma.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service("newsService")
@Transactional
public class NewsServiceImpl implements NewsService {
    @Resource
    private NewsDao dao;
    public void insertByBatch(List<NEWS> news) {


    }
}
