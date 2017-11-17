package com.wyj.wx.util;

import com.wyj.wx.base.Result;
/**
 * @Author:amorsueno
 * @Description:
 * @Date: 2017/11/17 17:03
 *
 */
public class ResultUtil {
    //当正确时返回的值
    public static Result success(Object data){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("OK");
        result.setData(data);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    //当错误时返回的值
    public static Result error(int code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
