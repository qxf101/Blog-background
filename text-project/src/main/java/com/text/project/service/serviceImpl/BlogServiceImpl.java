package com.text.project.service.serviceImpl;

import com.text.project.dao.BlogDao;
import com.text.project.entity.Blog;
import org.springframework.stereotype.Service;
import com.text.project.service.BlogService;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description:  Service层的实现类
* @Author: qxf
* @Date: 2019/5/26 5:48 PM
*/
@Service("BlogService")
public class BlogServiceImpl implements BlogService {
    @Resource
    private BlogDao blogDao;

    @Override
    public int addBlog(Blog blog) {
        return blogDao.addBlog(blog);
    }

    @Override
    public int delBlog(int id) {
        return blogDao.delBlog(id);
    }

    @Override
    public int updateBlog(Blog blog) {
        return blogDao.updateBlog(blog);
    }

    @Override
    public List<Blog> selectBlog() {
        return blogDao.selectBlog();
    }

    @Override
    public Blog selectById(int id) {
        return blogDao.selectById(id);
    }
}
