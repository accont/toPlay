package com.service;

import com.mybatis.pojo.Blog;
import com.mybatis.pojo.BlogExample;
import com.mybatis.pojo.ExtBlog;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2016/4/13.
 */
public interface BlogService {
    public int addBlog(Blog blog);

    public List<ExtBlog> getBlogList(Map<String,Object> map);

    public ExtBlog getById(int id);

    public int selectCount();
}
