package com.text.project.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sun.corba.se.spi.ior.ObjectKey;
import com.text.project.entity.Blog;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.text.project.service.BlogService;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
* @Description: 博客Controller类 
* @Author: qxf
* @Date: 2019/6/1 9:32 PM
*/
@RestController
public class BlogController {
    @Resource
    private BlogService blogService;

    /**
     * 查询
     */
    @PostMapping("/selectBlog")
    public List<Blog> selectBlog(){
        return blogService.selectBlog();
    }
    /**
     * 删除
     */
    @PostMapping("/delBlog")
    public String delBlog(@RequestBody JSONObject jb){
        int rowNum = 0;
        int id = Integer.parseInt(jb.get("id").toString());
        rowNum = blogService.delBlog(id);
        if(rowNum > 0){
            return "删除成功！";
        }else {
            return "删除失败！";
        }
    }
    /**
     * 新增
     */
    @PostMapping("/addBlog")
    public String addBlog(@RequestBody String str){
        int rowNum = 0;
        Blog blog = JSON.parseObject(str,Blog.class);
        blog.setBlogName(blog.getBlogName());
        blog.setBlogType(blog.getBlogType());
        blog.setCreateTime(new Date());
        blog.setAuthor(blog.getAuthor());
        blog.setBlogContext(blog.getBlogContext());
        rowNum = blogService.addBlog(blog);
        if(rowNum > 0){
            return "新增成功！";
        }else {
            return "新增失败！";
        }
    }
    /**
     * 修改
     */
    @PostMapping("/updateBlog")
    public String updateBlog(@RequestBody String str){
        int rowNum = 0;
        Blog blog = JSON.parseObject(str,Blog.class);
        blog.setId(blog.getId());
        blog.setBlogName(blog.getBlogName());
        blog.setBlogType(blog.getBlogType());
        blog.setCreateTime(blog.getCreateTime());
        blog.setAuthor(blog.getAuthor());
        blog.setBlogContext(blog.getBlogContext());
        rowNum = blogService.updateBlog(blog);
        if(rowNum > 0){
            return "修改成功！";
        }else {
            return "修改失败！";
        }
    }
    /**
     * 根据id查询
     */
    @PostMapping("/selectById")
    public Blog selectById(@RequestBody JSONObject jb){
        int id = Integer.parseInt(jb.get("id").toString());
        Blog blog = new Blog();
        blog = blogService.selectById(id);
        return blog;
    }
}