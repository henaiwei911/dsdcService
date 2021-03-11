package com.ds.hnw.dsgcservice.Service;

import com.ds.hnw.dsgcservice.Dao.logDao;
import com.ds.hnw.dsgcservice.entry.LogEntry;
import com.github.pagehelper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class logService {

    @Autowired
    private logDao logDao;

    public List<Object> queryLogInfo(LogEntry logEntry){
        PageHelper.startPage(logEntry.getPageIndex(),logEntry.getPageSize());
        List<Object> resultList =logDao.queryLogInfo(logEntry);
        return  resultList;

    }
}
