package com.ds.hnw.dsgcservice.Dao;

import com.definesys.mpaas.common.http.Response;
import com.ds.hnw.dsgcservice.entry.LogEntry;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface logDao {

    public List<Object> queryLogInfo(LogEntry logEntry);
}
