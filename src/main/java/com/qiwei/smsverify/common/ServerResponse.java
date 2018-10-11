package com.qiwei.smsverify.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
// 保证序列化json的时候，如果是null的时候，key也会消失
public class ServerResponse<T> implements Serializable {
    private int status;
    private String msg;
    private T data;
    private ServerResponse(int status){
        this.status = status;
    }
    private ServerResponse(int status, T data){
        this.status = status;
        this.data = data;
    }
    private ServerResponse(int status, String msg, T data){
        this.status = status;
        this.msg = msg;
        this.data = data;
    }
    private ServerResponse(int status, String msg){
        this.status = status;
        this.msg = msg;
    }
    @JsonIgnore
    // 使不在序列化中
    public boolean isSucess(){
        return this.status == ResponseCode.SUCESS.getCode();
    }
    public int getStatus(){
        return status;
    }
    public T getData(){
        return data;
    }
    public String getMsg(){
        return msg;
    }
    public static <T> ServerResponse<T> createBySucess(){
        return new ServerResponse<T>(ResponseCode.SUCESS.getCode());
    }
    public static <T> ServerResponse<T> createBySucess(String msg){
        return new ServerResponse<T>(ResponseCode.SUCESS.getCode(), msg);
    }
    public static <T> ServerResponse<T> createBySucess(T data){
        return new ServerResponse<T>(ResponseCode.SUCESS.getCode(), data);
    }
    public static <T> ServerResponse<T> createBySucess(String msg, T data){
        return new ServerResponse<T>(ResponseCode.SUCESS.getCode(), msg, data);
    }
    public static <T> ServerResponse<T> createByError(){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getDesc());
    }
    public static <T> ServerResponse<T> createByError(String errMsg){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(), errMsg);
    }
    public static <T> ServerResponse<T> createByError(int errCode, String errMsg){
        return new ServerResponse<T>(errCode, errMsg);
    }
}
