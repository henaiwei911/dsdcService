package com.ds.hnw.dsgcservice.entry;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

import java.io.Serializable;

@ApiModel(value = "user对象",description = "用户user对象")
public class User implements Serializable {

    @ApiModelProperty(value = "用户名",notes = "用于用户登录")
    private String userName;

    private String passWord;

    private String isLocked;

    public String getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(String isLocked) {
        this.isLocked = isLocked;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }





}
