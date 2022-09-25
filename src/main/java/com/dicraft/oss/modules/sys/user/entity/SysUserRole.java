package com.dicraft.oss.modules.sys.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
* <p>
* 用户角色实体类
* </p>
*
* @author DiCraft

*/
@Data
@TableName("sys_user_role")
public class SysUserRole extends Model<SysUserRole> {

    private static final long serialVersionUID = 1L;
    
    /**
    * ID
    */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;
    
    /**
    * 用户ID
    */
    @TableField("user_id")
    private String userId;
    
    /**
    * 角色ID
    */
    @TableField("role_id")
    private String roleId;
    
}
