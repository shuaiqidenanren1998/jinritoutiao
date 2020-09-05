package com.qf.service.impl;

import com.qf.dao.NewsDao;
import com.qf.pojo.News;
import com.qf.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsDao newsDao;

    @Override
    public List<News> findAll() {
        return newsDao.findAll();
    }
}
