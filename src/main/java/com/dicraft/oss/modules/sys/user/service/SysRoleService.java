package com.dicraft.oss.modules.sys.user.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dicraft.oss.core.api.dto.PagingReqDTO;
import com.dicraft.oss.modules.sys.user.dto.SysRoleDTO;
import com.dicraft.oss.modules.sys.user.entity.SysRole;


/**
* <p>
* 角色业务类
* </p>
*
* @author 聪明笨狗
* @since 2020-04-13 16:57
*/
public interface SysRoleService extends IService<SysRole> {

    /**
    * 分页查询数据
    * @param reqDTO
    * @return
    */
    IPage<SysRoleDTO> paging(PagingReqDTO<SysRoleDTO> reqDTO);
}
