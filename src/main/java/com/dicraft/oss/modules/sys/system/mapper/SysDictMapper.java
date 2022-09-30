package com.dicraft.oss.modules.sys.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* <p>
* 机主信息Mapper
* </p>
*
* @author DiCraft
*/
@Mapper
public interface SysDictMapper {

    /**
     * 查找数据字典
     * @param table
     * @param text
     * @param key
     * @param value
     * @return
     */
    String findDict(@Param("table") String table,
                    @Param("text") String text,
                    @Param("key") String key,
                    @Param("value") String value);
}
