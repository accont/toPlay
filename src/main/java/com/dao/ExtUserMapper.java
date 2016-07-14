package com.dao;

import com.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;
import java.util.Objects;

/**
 * Created by admin on 2016/4/5.
 */
public interface ExtUserMapper {
    public User getByName(Map<String,Object> map);

    public User selectByLogin(Map<String,Object> map);
}
