package com.neo.vo;

import com.neo.vo.utils.IErrorCode;
import com.neo.vo.utils.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author : neo
 * @Date 2021/7/27 11:05
 * @Description : TODO
 */

@Data
// @NoArgsConstructor
public class DataVo<T> {
    private Integer code;
    private String msg;
    private Integer count;
    private List<T> data;


    protected DataVo(Integer code, String msg, Integer count, List<T> data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    protected DataVo() {
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     */
    public static <T>  DataVo<T> success(Integer count, List<T> data) {
        return new DataVo<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), count, data);
    }

    /**
     * 成功返回结果
     *
     * @param data    获取的数据
     * @param message 提示信息
     */
    public static <T> DataVo<T> success(String message, Integer count, List<T> data) {
        return new DataVo<T>(ResultCode.SUCCESS.getCode(), message, count, data);
    }

    /**
     * 扩展使用
     * 失败返回结果
     *
     * @param errorCode 错误码
     */
    public static <T> DataVo<T> failed(IErrorCode errorCode) {
        return new DataVo<T>(errorCode.getCode(), errorCode.getMsg(), null,null);
    }

    /**
     * 自定义错误消息
     * 失败返回结果
     *
     * @param message 提示信息
     */
    public static <T> DataVo<T> failed(String message) {
        return new DataVo<T>(ResultCode.FAILED.getCode(), message, null,null);
    }

    /**
     * 默认的
     * 失败返回结果
     */
    public static <T> DataVo<T> failed() {
        return failed(ResultCode.FAILED);
    }

    /**
     * 参数验证失败返回结果
     */
    public static <T> DataVo<T> validateFailed() {
        return failed(ResultCode.VALIDATE_FAILED);
    }

    /**
     * 参数验证失败返回结果
     *
     * @param message 提示信息
     */
    public static <T> DataVo<T> validateFailed(String message) {
        return new DataVo<T>(ResultCode.VALIDATE_FAILED.getCode(), message, null, null);
    }

    /**
     * 未登录返回结果
     */
    public static <T> DataVo<T> unauthorized() {
        return new DataVo<T>(ResultCode.UNAUTHORIZED.getCode(), ResultCode.UNAUTHORIZED.getMsg(),null, null);
    }

    /**
     * 未授权返回结果
     */
    public static <T> DataVo<T> forbidden() {
        return new DataVo<T>(ResultCode.FORBIDDEN.getCode(), ResultCode.FORBIDDEN.getMsg(), null,null);

    }
}

