package com.ds.hnw.dsgcservice.entry;

public class logResult {

    private String track_Id;  //日志实例ID
    private String biz_Status;  //token名

    public String getTrack_Id() {
        return track_Id;
    }

    public void setTrack_Id(String track_Id) {
        this.track_Id = track_Id;
    }

    public String getBiz_Status() {
        return biz_Status;
    }

    public void setBiz_Status(String biz_Status) {
        this.biz_Status = biz_Status;
    }
}
