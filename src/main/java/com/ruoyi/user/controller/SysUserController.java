package com.ruoyi.user.controller;

import com.ruoyi.user.domain.SysUser;
import com.ruoyi.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SysUserController {

    @Autowired
    private SysUserService userService;

    @PostMapping("/login")
    public String login(SysUser user) {
        boolean result = userService.login(user);
        if (result == true) {
            return "登录成功！";
        }
        return "登录失败！";
    }

    @GetMapping(value = "/list")
    public List<SysUser> list() {
        List<SysUser> userList = userService.userList();
        return userList;
    }

}
