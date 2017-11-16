package com.wyj.wx.entity;

import lombok.Data;

@Data
public class Result<T> {
    private int code;//状态码

    private String msg;//信息

    private Object data;//数据
}

