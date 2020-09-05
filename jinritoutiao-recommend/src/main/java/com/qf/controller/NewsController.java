package com.qf.controller;

import com.qf.pojo.News;
import com.qf.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @RequestMapping("findAll")
    public List<News> findAll () {
        System.out.println(newsService.findAll());
        return newsService.findAll();
    }

}
