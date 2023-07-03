package com.bigdata.controller;

import com.bigdata.exception.BusinessException;
import com.bigdata.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 项目异常AOP处理
 *
 * @author 吴河山
 * @date 2023/07/03 10:11
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {
        //@ExceptionHandler用于设置当前处理器类对应的异常类型
        @ExceptionHandler(SystemException.class)
        public Result doSystemException(SystemException ex) {
        //记录日志
        //发送报错给运维
        return new Result(ex.getCode(),null,ex.getMessage());//返回错误给前端
    }

        @ExceptionHandler(BusinessException.class)
        public Result doBusinessException(BusinessException ex) {
        return new Result(ex.getCode(),null,ex.getMessage());
    }

        //除了自定义的异常处理器，保留对Exception类型的异常处理，用于处理非预期的异常
        @ExceptionHandler(Exception.class)
        public Result doOtherException(Exception ex) {
            //记录日志
            //发送报错给运维
        return new Result(Code.SYSTEM_UNKNOW_ERR,null,"系统繁忙，请稍后再试！");
    }
}
