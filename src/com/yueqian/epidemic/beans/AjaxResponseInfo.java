package com.yueqian.epidemic.beans;

public class AjaxResponseInfo<T> {
    //-1，参数不足，-2，权限不足，0，正常应答
    private int code;
    //成功或失败的提示信息
    private String msg;

    //返回的数据
    private T data;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }
}
