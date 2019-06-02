package com.text.project.service;

import com.text.project.entity.Blog;

import java.util.List;

/**
* @Description: Service层的博客接口
* @Author: qxf
* @Date: 2019/5/26 5:47 PM
*/
public interface BlogService {
    /**
     * 新增博客
     * @param blog
     * @return
     */
    int addBlog(Blog blog);

    /**
     * 删除博客
     * @param id
     * @return
     */
    int delBlog(int id);

    /**
     * 修改博客
     * @param blog
     * @return
     */
    int updateBlog(Blog blog);

    /**
     * 查询博客
     * @return
     */
    List<Blog> selectBlog();
    /**
     * 根据id查询
     */
    Blog selectById(int id);
}
