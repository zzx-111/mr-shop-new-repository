package com.baidu.shop.status;

/**
 * 2 * @ClassName BaseApiService
 * 3 * @Description: TODO
 * 4 * @Author zzx
 * 5 * @Date 2021/1/20
 * 6 * @Version V1.0
 * 7
 **/

import com.baidu.shop.base.Result;
import com.baidu.shop.utils.JSONUtil;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Data
@Component
@Slf4j
public class BaseApiService<T> {
    public Result<T> setResultError(Integer code, String msg) {
        return setResult(code, msg, null);
    }
    // 返回错误，可以传msg
    public Result<T> setResultError(String msg) {
        return setResult(HTTPStatus.ERROR, msg, null);
    }
    // 返回成功，可以传data值
    public Result<T> setResultSuccess(T data) {
        return setResult(HTTPStatus.OK, HTTPStatus.OK + "", data);
    }
    // 返回成功，沒有data值
    public Result<T> setResultSuccess() {
        return setResult(HTTPStatus.OK, HTTPStatus.OK + "", null);
    }
    // 返回成功，沒有data值
    public Result<T> setResultSuccess(String msg) {
        return setResult(HTTPStatus.OK, msg, null);
    }
    // 通用封装
    public Result<T> setResult(Integer code, String msg, T data) {
        log.info(String.format("{code : %s , message : %s , data : %s}",code,msg,
                JSONUtil.toJsonString(data)));
        return new Result<T>(code, msg, data);
    }
}