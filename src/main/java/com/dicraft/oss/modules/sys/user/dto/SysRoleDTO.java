package com.dicraft.oss.modules.sys.user.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
* <p>
* 角色请求类
* </p>
*
* @author DiCraft
*/
@Data
@ApiModel(value="角色", description="角色")
public class SysRoleDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    @ApiModelProperty(value = "角色ID", required=true)
    private String id;
    
    @ApiModelProperty(value = "角色名称", required=true)
    private String roleName;
    
}
