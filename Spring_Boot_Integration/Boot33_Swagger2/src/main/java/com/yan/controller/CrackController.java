package com.yan.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value="/test", tags="测试接口模块")
@RestController
public class CrackController {
    @GetMapping("/test")
    public String crack(){
        return "ok";//JsonBuilder.builder().put("validTo",Long.parseLong("111111111111111")).put("valid",true).build();
    }


    @ApiOperation(value="获取用户列表value", notes="获取用户列表notes")
    @GetMapping("/{id}")
    public Object cracqk(){
        return "1342";
    }
}
