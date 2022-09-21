package com.dicraft.oss.exception;

import com.dicraft.oss.api.ApiError;
import com.dicraft.oss.api.ApiRest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: DiCraft
 * @Date: 2022/9/21 9:39
 * @package: com.dicraft.oss.exception
 * @Version: 1.0
 * @Decsription:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceException extends RuntimeException {
    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误消息
     */
    private String msg;

    /**
     * 从结果初始化
     * @param apiRest
     */
    public ServiceException(ApiRest apiRest){
        this.code = apiRest.getCode();
        this.msg = apiRest.getMsg();
    }

    /**
     * 从枚举中获取参数
     * @param apiError
     */
    public ServiceException(ApiError apiError){
        this.code = apiError.getCode();
        this.msg = apiError.msg;
    }

    /**
     * 异常构造
     * @param msg
     */
    public ServiceException(String msg){
        this.code = 1;
        this.msg = msg;
    }
}
