package com.dicraft.oss.api;

import com.dicraft.oss.exception.ServiceException;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: DiCraft
 * @Date: 2022/9/21 9:36
 * @package: com.dicraft.oss.api
 * @Version: 1.0
 * @Decsription: 数据结果返回的封装
 */
@Data
@NoArgsConstructor
@ApiModel(value="接口响应", description="接口响应")
public class ApiRest<T> {
    /**
     * 响应消息
     */
    @ApiModelProperty(value = "响应消息")
    private String msg;
    /**
     * 响应代码
     */
    @ApiModelProperty(value = "响应代码,0为成功,1为失败", required = true)
    private Integer code;

    /**
     * 请求或响应body
     */
    @ApiModelProperty(value = "响应内容")
    protected T data;


    /**
     * 是否成功
     * @return
     */
    public boolean isSuccess(){
        return code.equals(0);
    }

    /**
     * 构造函数
     * @param error
     */
    public ApiRest(ServiceException error){
        this.code = error.getCode();
        this.msg = error.getMsg();
    }

    /**
     * 构造函数
     * @param error
     */
    public ApiRest(ApiError error){
        this.code = error.getCode();
        this.msg = error.msg;
    }
}
