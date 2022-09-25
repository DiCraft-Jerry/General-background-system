package com.dicraft.oss.modules.sys.user.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.dicraft.oss.api.ApiRest;
import com.dicraft.oss.core.api.controller.BaseController;
import com.dicraft.oss.core.api.dto.PagingReqDTO;
import com.dicraft.oss.modules.sys.user.dto.SysRoleDTO;
import com.dicraft.oss.modules.sys.user.entity.SysRole;
import com.dicraft.oss.modules.sys.user.service.SysRoleService;
import com.dicraft.oss.utils.BeanMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 管理用户控制器
 * </p>
 *
 * @author DiCraft
 */
@Api(tags = {"管理用户"})
@RestController
@RequestMapping("/exam/api/sys/role")
public class SysRoleController extends BaseController {

    @Autowired
    private SysRoleService baseService;




    /**
     * 分页查找
     * @param reqDTO
     * @return
     */
    @ApiOperation(value = "分页查找")
    @RequestMapping(value = "/paging", method = { RequestMethod.POST})
    public ApiRest<IPage<SysRoleDTO>> paging(@RequestBody PagingReqDTO<SysRoleDTO> reqDTO) {

        //分页查询并转换
        IPage<SysRoleDTO> page = baseService.paging(reqDTO);
        return super.success(page);
    }

    /**
     * 查找列表，每次最多返回200条数据
     * @return
     */
    @ApiOperation(value = "查找列表")
    @RequestMapping(value = "/list", method = { RequestMethod.POST})
    public ApiRest<List<SysRoleDTO>> list() {

        //分页查询并转换
        QueryWrapper<SysRole> wrapper = new QueryWrapper<>();

        //转换并返回
        List<SysRole> list = baseService.list(wrapper);

        //转换数据
        List<SysRoleDTO> dtoList = BeanMapper.mapList(list, SysRoleDTO.class);

        return super.success(dtoList);
    }
}
