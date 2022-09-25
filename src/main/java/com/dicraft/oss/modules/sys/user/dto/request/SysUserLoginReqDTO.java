package com.dicraft.oss.modules.sys.user.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
* <p>
* 管理员登录请求类
* </p>
*
* @author DiCraft
*/
@Data
@ApiModel(value="管理员登录请求类", description="管理员登录请求类")
public class SysUserLoginReqDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户名", required=true)
    private String username;

    @ApiModelProperty(value = "密码", required=true)
    private String password;
    
}
