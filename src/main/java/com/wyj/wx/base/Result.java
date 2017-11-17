package com.wyj.wx.base;

import lombok.Data;
/**
 * @Author:amorsueno
 * @Description:
 * @Date: 2017/11/17 17:03
 *
 */
@Data
public class Result<T> {
    private int code;//状态码

    private String msg;//信息

    private Object data;//数据
}

