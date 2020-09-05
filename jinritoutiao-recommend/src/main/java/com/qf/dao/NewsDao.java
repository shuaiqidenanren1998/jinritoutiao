package com.qf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.pojo.News;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsDao extends BaseMapper<News> {

    @Select("SELECT * FROM news ORDER BY SUBSTR(created_date,1,10) DESC, SUBSTR(created_date,12) DESC")
    public List<News> findAll ();

}
