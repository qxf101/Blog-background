package com.text.project.entity;

import java.util.Date;

/**
* @Description: 博客实体类
* @Author: qxf
* @Date: 2019/5/26 5:40 PM
*/
public class Blog {
    /**
     * id
     */
    private int id;
    /**
     * 博客名称
     */
    private String blogName;
    /**
     * 博客类型
     */
    private String blogType;
    /**
     * 博客创建日期
     */
    private Date createTime;
    /**
     * 博客作者
     */
    private String author;
    /**
     * 博客内容
     */
    private String blogContext;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public String getBlogType() {
        return blogType;
    }

    public void setBlogType(String blogType) {
        this.blogType = blogType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBlogContext() {
        return blogContext;
    }

    public void setBlogContext(String blogContext) {
        this.blogContext = blogContext;
    }
}
