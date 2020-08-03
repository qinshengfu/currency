package com.qsf.currency.handler;

import com.qsf.currency.exception.ResultEnumException;
import com.qsf.currency.utils.ResultVOUtil;
import com.qsf.currency.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 捕获异常
 * 除了自定义的异常外，其他都返回为系统异常
 * @Author QSF
 * @Date 2020/8/3 11:18
 * @Version 1.0
 */
@Slf4j
public class ResultEnumExceptionHandle {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultVO handle(Exception e) {
        if (e instanceof ResultEnumException) {
            ResultEnumException resultEnumException = (ResultEnumException) e;
            return ResultVOUtil.error(resultEnumException.getCode(), resultEnumException.getMessage());
        } else {
            log.error("【系统异常】{}", e);
            return ResultVOUtil.error(-1, "未知错误");
        }

    }
}
