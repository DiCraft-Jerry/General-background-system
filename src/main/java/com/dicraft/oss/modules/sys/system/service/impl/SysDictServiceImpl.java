package com.dicraft.oss.modules.sys.system.service.impl;


import com.dicraft.oss.modules.sys.system.mapper.SysDictMapper;
import com.dicraft.oss.modules.sys.system.service.SysDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author DiCraft
 */
@Service
public class SysDictServiceImpl implements SysDictService {

    @Resource
    private SysDictMapper sysDictMapper;

    @Override
    public String findDict(String table, String text, String key, String value) {
        return sysDictMapper.findDict(table, text, key, value);
    }
}
