package com.dao;

import com.mybatis.pojo.ExtBlog;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2016/4/15.
 */
public interface ExtBlogMapper {
    public List<ExtBlog> getList(Map<String,Object> map);

    public ExtBlog getById(int id);

    public int selectCount();
}
