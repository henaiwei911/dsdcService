package com.ds.hnw.dsgcservice.controller;


import com.definesys.mpaas.common.http.Response;
import com.ds.hnw.dsgcservice.Service.logService;
import com.ds.hnw.dsgcservice.entry.LogEntry;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/dsgc/log")
@RestController
@Api(description = "日志模块", tags = "系统模块")
public class logController {

    @Autowired
    private logService logService;

    @ApiOperation(value = "日志查询接口", notes = "查询接口")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Response queryLogInfo(@RequestBody LogEntry logEntry){
        System.out.println("传入的参数"+logEntry);
        List<Object> list = logService.queryLogInfo(logEntry);
        return Response.ok().setMessage("查询成功！").data(list);
    }

}
