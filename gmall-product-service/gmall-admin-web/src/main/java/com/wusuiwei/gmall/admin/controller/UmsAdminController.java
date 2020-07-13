package com.wusuiwei.gmall.admin.controller;

import com.wusuiwei.gmall.ums.service.AdminService;
import com.wusuiwei.gmall.ums.to.UmsAdminLoginParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@Api("后台用户管理")
public class UmsAdminController {

    @Autowired
    private AdminService adminService;


    @PostMapping("/register")
    @ApiOperation("用户注册")
    public Object register(@RequestBody UmsAdminLoginParam umsAdminLoginParam) {
        Admin admin =adminService.login(umsAdminLoginParam.getUserName(), umsAdminLoginParam.getPassword());
        return null;
    }

    @PostMapping("/login")
    @ApiOperation("用户登录")
    public Object login(@RequestBody UmsAdminLoginParam umsAdminLoginParam) {
        Admin admin =adminService.login(umsAdminLoginParam.getUserName(), umsAdminLoginParam.getPassword());
        return null;
    }
}
