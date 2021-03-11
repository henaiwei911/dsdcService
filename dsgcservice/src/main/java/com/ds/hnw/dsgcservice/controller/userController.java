package com.ds.hnw.dsgcservice.controller;

import com.alibaba.druid.util.StringUtils;
import com.definesys.mpaas.common.http.Response;
import com.ds.hnw.dsgcservice.Service.userService;
import com.ds.hnw.dsgcservice.entry.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/dsgc/user")
@RestController
@Api(description = "用户模块", tags = "系统模块")
public class userController {

    @Autowired
    userService userS;


    @ApiOperation(value = "用户登录接口", notes = "用户登录接口")
    @RequestMapping(value = "/login", method = RequestMethod.POST)

    public Response login(@RequestBody User u) {
        if (u == null || StringUtils.isEmpty(u.getUserName()) || StringUtils.isEmpty(u.getPassWord())) {
            return Response.error("账号密码不能为空").setMessage("账号密码不能为空");
        }

        User cheackUser = userS.getUserByUsername(u);
        if(cheackUser==null){
            return Response.error("账号不存在，请重新输入").setMessage("账号不存在，请重新输入");
        }else if(!cheackUser.getPassWord().equals(u.getPassWord())){
            return Response.error("密码不正确，请重新输入").setMessage("密码不正确，请重新输入");
        }else if(cheackUser.getIsLocked()=="Y"){
            return Response.error("账户已被锁定").setMessage("账户已被锁定，请联系管理员");
        }else {
            Map<String,Object> retMap = new HashMap<>();
            //retMap.put("token",token);
            retMap.put("userInfo",cheackUser);
//          Cookie cookie = new Cookie("token", token);
//          response.addCookie(cookie);

            return Response.ok().setMessage("登录成功！").data(retMap);

        }

    }
}
