package com.text.project.dao;

import com.text.project.entity.Blog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @Description: 博客接口
* @Author: qxf
* @Date: 2019/5/26 5:40 PM
*/
@Mapper
public interface BlogDao {
    /**
     * 新增博客
     * @param blog
     * @return int
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
     * 根据id查询博客
     */
    Blog selectById(int id);
}
