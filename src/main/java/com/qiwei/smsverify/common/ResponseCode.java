package com.qiwei.smsverify.common;

public enum  ResponseCode {
    SUCESS(0, "SUCESS"),
    ERROR(1, "ERROR");

    private  final int code;
    private final String desc;
    ResponseCode(int code, String desc){
        this.code = code;
        this.desc = desc;
    };

    public int getCode(){
        return code;
    }
    public String getDesc(){
        return desc;
    }
}
