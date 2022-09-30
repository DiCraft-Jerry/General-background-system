package com.dicraft.oss.modules.sys.system.service;

import org.springframework.stereotype.Service;

/**
 * 数据字典工具类
 * @author DiCraft
 */
@Service
public interface SysDictService {

    /**
     * 查找数据字典
     * @param table
     * @param text
     * @param key
     * @param value
     * @return
     */
    String findDict(String table,
                    String text,
                    String key,
                    String value);
}
