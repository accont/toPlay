package com.service;

import com.mybatis.pojo.OperateUpDown;

import java.util.Map;

/**
 * Created by admin on 2016/4/20.
 */
public interface ExtOperateUpDownService {

    //查看私有有过点赞
    public OperateUpDown selectCount(Map<String,Object>map);

    public int insertThumb(OperateUpDown operateUpDown);

    public int insertStep(OperateUpDown operateUpDown);

    //查询用户是否已经点赞
    public OperateUpDown selectThumb(Map<String,Object> map);

    //查询用户是否已经踩过
    public OperateUpDown selectStep(Map<String,Object> map);

    //点赞次数加1
    public int updateThumb();

    //踩的次数加1
    public int updateStep();

    public int countThumb(int id);


}

