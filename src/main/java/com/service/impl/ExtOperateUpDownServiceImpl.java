package com.service.impl;

import com.dao.ExtOperateUpDownMapper;
import com.mybatis.pojo.OperateUpDown;
import com.service.ExtOperateUpDownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by admin on 2016/4/20.
 */
@Service
public class ExtOperateUpDownServiceImpl implements ExtOperateUpDownService {
    @Autowired
    private ExtOperateUpDownMapper extOperateUpDownMapper;

    @Override
    public OperateUpDown selectCount(Map<String, Object> map) {
        return extOperateUpDownMapper.selectCount(map);
    }

    @Override
    public int insertThumb(OperateUpDown operateUpDown) {
        return extOperateUpDownMapper.insertThumb(operateUpDown);
    }

    @Override
    public int insertStep(OperateUpDown operateUpDown) {
        return extOperateUpDownMapper.insertStep(operateUpDown);
    }

    @Override
    public OperateUpDown selectThumb(Map<String, Object> map) {
        return extOperateUpDownMapper.selectThumb(map);
    }

    @Override
    public OperateUpDown selectStep(Map<String, Object> map) {
        return extOperateUpDownMapper.selectStep(map);
    }

    @Override
    public int updateThumb() {
        return extOperateUpDownMapper.updateThumb();
    }

    @Override
    public int updateStep() {
        return extOperateUpDownMapper.updateStep();
    }

    @Override
    public int countThumb(int id) {
        return extOperateUpDownMapper.countThumb(id);
    }
}
