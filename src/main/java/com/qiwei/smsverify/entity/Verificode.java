package com.qiwei.smsverify.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author qiwei
 * @since 2018-09-06
 */
public class Verificode implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId("codeId")
    private String codeId;
    /**
     * 项目编号
     */
    @TableField("tId")
    private String tId;
    /**
     * 手机号
     */
    @TableField("phoneNumber")
    private String phoneNumber;
    /**
     * 验证码内容
     */
    @TableField("codeContent")
    private String codeContent;


    public String getCodeId() {
        return codeId;
    }

    public void setCodeId(String codeId) {
        this.codeId = codeId;
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCodeContent() {
        return codeContent;
    }

    public void setCodeContent(String codeContent) {
        this.codeContent = codeContent;
    }

    @Override
    public String toString() {
        return "Verificode{" +
        "codeId=" + codeId +
        ", tId=" + tId +
        ", phoneNumber=" + phoneNumber +
        ", codeContent=" + codeContent +
        "}";
    }
}
