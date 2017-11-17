package com.wyj.wx.util;

import java.util.Date;
/**
 * @Author:amorsueno
 * @Description:
 * @Date: 2017/11/17 17:02
 *
 */
public class BaseResponse<T>  {
    /**
     * 返回码
     */
    private int code;

    /**
     * 返回信息描述
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

    private long currentTime;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(long currentTime) {
        this.currentTime = currentTime;
    }

    public BaseResponse(){}

    /**
     *
     * @param code 错误码
     * @param message 信息
     * @param data 数据
     */
    public BaseResponse(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.currentTime = new Date().getTime();
    }

    /**
     * 不带数据的返回结果
     * @param resultStatus
     */
    public BaseResponse(WxResultStatus resultStatus) {
        this.code = resultStatus.getErrorCode();
        this.message = resultStatus.getErrorMsg();
        this.data = data;
        this.currentTime = new Date().getTime();
    }

    /**
     * 带数据的返回结果
     * @param resultStatus
     * @param data
     */
    public BaseResponse(WxResultStatus resultStatus, T data) {
        this.code = resultStatus.getErrorCode();
        this.message = resultStatus.getErrorMsg();
        this.data = data;
        this.currentTime = new Date().getTime();
    }
}
