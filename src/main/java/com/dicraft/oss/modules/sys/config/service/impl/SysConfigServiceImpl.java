package com.dicraft.oss.modules.sys.config.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.dicraft.oss.modules.sys.config.dto.SysConfigDTO;
import com.dicraft.oss.modules.sys.config.entity.SysConfig;
import com.dicraft.oss.modules.sys.config.mapper.SysConfigMapper;
import com.dicraft.oss.modules.sys.config.service.SysConfigService;
import com.dicraft.oss.utils.BeanMapper;
import org.springframework.stereotype.Service;

/**
* <p>
* 语言设置 服务实现类
* </p>
*
* @author DiCraft
*/
@Service
public class SysConfigServiceImpl extends ServiceImpl<SysConfigMapper, SysConfig> implements SysConfigService {

    @Override
    public SysConfigDTO find() {

        QueryWrapper<SysConfig> wrapper = new QueryWrapper<>();
        wrapper.last(" LIMIT 1");

        SysConfig entity = this.getOne(wrapper, false);
        SysConfigDTO dto = new SysConfigDTO();
        BeanMapper.copy(entity, dto);
        return dto;
    }
}
