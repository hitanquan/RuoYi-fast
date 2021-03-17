package com.ruoyi.user.mapper;

import com.ruoyi.user.domain.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserMapper {
    List<SysUser> selectUserList();

    int selectUserByUsernameAndPassword(SysUser user);
}
