package com.dicraft.oss.modules.sys.user.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
* <p>
* 用户角色请求类
* </p>
*
* @author DiCraft
*/
@Data
@ApiModel(value="用户角色", description="用户角色")
public class SysUserRoleDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    @ApiModelProperty(value = "ID", required=true)
    private String id;
    
    @ApiModelProperty(value = "用户ID", required=true)
    private String userId;
    
    @ApiModelProperty(value = "角色ID", required=true)
    private String roleId;
    
}
