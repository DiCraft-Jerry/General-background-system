package com.dicraft.oss.modules.sys.config.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dicraft.oss.modules.sys.config.dto.SysConfigDTO;
import com.dicraft.oss.modules.sys.config.entity.SysConfig;


/**
* <p>
* 通用配置业务类
* </p>
*
* @author DiCraft
*/
public interface SysConfigService extends IService<SysConfig> {

    /**
     * 查找配置信息
     * @return
     */
    SysConfigDTO find();
}
