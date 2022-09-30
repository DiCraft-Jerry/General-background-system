package com.dicraft.oss.modules.sys.depart.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.dicraft.oss.modules.sys.depart.dto.SysDepartDTO;
import com.dicraft.oss.modules.sys.depart.dto.response.SysDepartTreeDTO;
import com.dicraft.oss.modules.sys.depart.entity.SysDepart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* <p>
* 部门信息Mapper
* </p>
*
* @author DiCraft
*/
@Mapper
public interface SysDepartMapper extends BaseMapper<SysDepart> {

    /**
     * 部门树分页
     * @param page
     * @param query
     * @return
     */
    IPage<SysDepartTreeDTO> paging(Page page, @Param("query") SysDepartDTO query);
}
