package com.ds.hnw.dsgcservice.entry;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

@ApiModel(value = "log对象",description = "日志log对象")
public class LogEntry implements Serializable {

    private String servNo;

    private int pageSize;

    private int pageIndex;

    public String getServNo() {
        return servNo;
    }

    public void setServNo(String servNo) {
        this.servNo = servNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

}
