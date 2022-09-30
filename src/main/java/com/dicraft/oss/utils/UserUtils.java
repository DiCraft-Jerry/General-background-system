package com.dicraft.oss.utils;

import com.dicraft.oss.api.ApiError;

import com.dicraft.oss.exception.ServiceException;
import com.dicraft.oss.modules.sys.user.dto.response.SysUserLoginDTO;
import org.apache.shiro.SecurityUtils;

/**
 * @author: DiCraft
 * @Date: 2022/9/21 15:02
 * @package: com.dicraft.oss.utils
 * @Version: 1.0
 * @Decsription: 用户静态工具类
 */
public class UserUtils {


    /**
     * 获取当前登录用户的ID
     * @param throwable
     * @return
     */
    public static String getUserId(boolean throwable){
        try {
            return ((SysUserLoginDTO) SecurityUtils.getSubject().getPrincipal()).getId();
        }catch (Exception e){
            if(throwable){
                throw new ServiceException(ApiError.ERROR_10010002);
            }
            return null;
        }
    }

    /**
     * 获取当前登录用户的ID
     * @param throwable
     * @return
     */
    public static boolean isAdmin(boolean throwable){
        try {
            SysUserLoginDTO dto = ((SysUserLoginDTO) SecurityUtils.getSubject().getPrincipal());
            return dto.getRoles().contains("sa");
        }catch (Exception e){
            if(throwable){
                throw new ServiceException(ApiError.ERROR_10010002);
            }
        }

        return false;
    }

    /**
     * 获取当前登录用户的ID，默认是会抛异常的
     * @return
     */
    public static String getUserId(){
        return getUserId(true);
    }

}
