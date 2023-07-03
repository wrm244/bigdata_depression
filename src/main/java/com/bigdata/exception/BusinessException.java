package com.bigdata.exception;

/**
 * 业务异常处理
 *
 * @author 吴河山
 * @date 2023/07/03 10:13
 */
public class BusinessException extends RuntimeException {
    private Integer code;

    public BusinessException(Integer code,String message ) {
        super(message);
        this.code = code;
    }

    public BusinessException(Integer code,String message,Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
