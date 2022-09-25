package com.dicraft.oss.modules.sys.depart.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dicraft.oss.core.api.dto.PagingReqDTO;
import com.dicraft.oss.modules.sys.depart.dto.SysDepartDTO;
import com.dicraft.oss.modules.sys.depart.dto.response.SysDepartTreeDTO;
import com.dicraft.oss.modules.sys.depart.entity.SysDepart;

import java.util.List;

/**
* <p>
* 部门信息业务类
* </p>
*
* @author DiCraft
*/
public interface SysDepartService extends IService<SysDepart> {

    /**
     * 保存
     * @param reqDTO
     */
    void save(SysDepartDTO reqDTO);

    /**
    * 分页查询数据
    * @param reqDTO
    * @return
    */
    IPage<SysDepartTreeDTO> paging(PagingReqDTO<SysDepartDTO> reqDTO);

    /**
     * 查找部门树结构
     * @return
     */
    List<SysDepartTreeDTO> findTree();

    /**
     * 查找部门树
     * @param ids
     * @return
     */
    List<SysDepartTreeDTO> findTree(List<String> ids);

    /**
     * 排序
     * @param id
     * @param sort
     */
    void sort(String id, Integer sort);


    /**
     * 获取某个部门ID下的所有子部门ID
     * @param id
     * @return
     */
    List<String> listAllSubIds( String id);
}
