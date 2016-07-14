package com.service.impl;

import com.dao.ExtBlogMapper;
import com.mybatis.dao.BlogMapper;
import com.mybatis.pojo.Blog;
import com.mybatis.pojo.BlogExample;
import com.mybatis.pojo.ExtBlog;
import com.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2016/4/13.
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Autowired
    private ExtBlogMapper extBlogMapper;

    @Override
    public int addBlog(Blog blog) {
        return blogMapper.insertSelective(blog);
    }

    @Override
    public List<ExtBlog> getBlogList(Map<String,Object> map) {
        return extBlogMapper.getList(map);
    }

    @Override
    public ExtBlog getById(int id) {
        return extBlogMapper.getById(id);
    }

    @Override
    public int selectCount() {
        return extBlogMapper.selectCount();
    }
}
