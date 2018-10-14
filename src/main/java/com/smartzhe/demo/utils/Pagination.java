package com.smartzhe.demo.utils;

/**
 * Created by luohuahua on 18/10/13.
 */
public class Pagination<T> {

    public static <T> Pagination success(T data){
        Pagination pagination = new Pagination();
        pagination.setData(data);
        pagination.setCode(0);
        pagination.setMsg("");
        return pagination;
    }

    T data;

    private int code;

    private String msg;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
