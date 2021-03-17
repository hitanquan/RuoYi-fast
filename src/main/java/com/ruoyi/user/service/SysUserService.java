package com.ruoyi.user.service;

import com.ruoyi.user.domain.SysUser;

import java.util.List;

public interface SysUserService {
    boolean login(SysUser user);

    List<SysUser> userList();
}
