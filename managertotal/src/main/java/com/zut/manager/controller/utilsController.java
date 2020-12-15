package com.zut.manager.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/util")
@RestController
@Api
public class utilsController {

    @RequestMapping("/unLogin")
    public String unLogin()
    {
        return "未登录，请登录后再操作";
    }
    @RequestMapping("/noPermission")
    public String noPermission()
    {
        return "没有权限";
    }
}
