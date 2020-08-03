package com.qsf.currency.exception;

import com.qsf.currency.enums.ResultEnum;
import lombok.Data;

/**
 * 统一异常处理
 * 定义异常，继承RuntimeException
 * @Author QSF
 * @Date 2020/8/3 11:15
 * @Version 1.0
 */
@Data
public class ResultEnumException extends RuntimeException {

    private Integer code;

    public ResultEnumException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
