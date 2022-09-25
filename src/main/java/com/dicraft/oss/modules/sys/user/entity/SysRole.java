package com.dicraft.oss.modules.sys.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
* <p>
* 角色实体类
* </p>
*
* @author DiCraft
*/
@Data
@TableName("sys_role")
public class SysRole extends Model<SysRole> {

    private static final long serialVersionUID = 1L;
    
    /**
    * 角色ID
    */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;
    
    /**
    * 角色名称
    */
    @TableField("role_name")
    private String roleName;
    
}
