package com.qf.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("news")
public class News {

    @TableId(type = IdType.AUTO)
    @TableField("id")
    private Integer id;
    @TableField("title")
    private String title;
    @TableField("link")
    private String link;
    @TableField("image")
    private String image;
    @TableField("like_count")
    private String likeCount;
    @TableField("comment_count")
    private String commentCount;
    @TableField("created_date")
    private String createdDate;
    @TableField("user_id")
    private String userId;

}
