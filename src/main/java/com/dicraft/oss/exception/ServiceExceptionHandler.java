package com.dicraft.oss.exception;

import com.dicraft.oss.api.ApiRest;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

/**
 * @author: DiCraft
 * @Date: 2022/9/21 15:04
 * @package: com.dicraft.oss.exception
 * @Version: 1.0
 * @Decsription: 统一异常处理类
 */
@RestControllerAdvice
public class ServiceExceptionHandler {

    /**
     * 应用到所有@RequestMapping注解方法，在其执行之前初始化数据绑定器
     * @param binder
     */
    @InitBinder
    public void initWebBinder(WebDataBinder binder){

    }

    /**
     * 把值绑定到Model中，使全局@RequestMapping可以获取到该值
     * @param model
     */
    @ModelAttribute
    public void addAttribute(Model model) {

    }

    /**
     * 捕获ServiceException
     * @param e
     * @return
     */
    @ExceptionHandler({com.dicraft.oss.exception.ServiceException.class})
    @ResponseStatus(HttpStatus.OK)
    public ApiRest serviceExceptionHandler(ServiceException e) {
        return new ApiRest(e);
    }

}
