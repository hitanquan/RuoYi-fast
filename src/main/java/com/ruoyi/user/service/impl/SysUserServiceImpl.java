package com.ruoyi.user.service.impl;

import com.ruoyi.user.domain.SysUser;
import com.ruoyi.user.mapper.SysUserMapper;
import com.ruoyi.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper userMapper;


    @Override
    public boolean login(SysUser user) {
        int result = userMapper.selectUserByUsernameAndPassword(user);
        if (result == 1) {
            return true;
        }
        return false;
    }

    @Override
    public List<SysUser> userList() {
        return userMapper.selectUserList();
    }


}
