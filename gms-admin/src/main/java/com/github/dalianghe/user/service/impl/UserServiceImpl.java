package com.github.dalianghe.user.service.impl;

import com.github.dalianghe.user.entity.SysUser;
import com.github.dalianghe.user.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2018/1/12.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public SysUser getSysUserByUsername(String username) {
        SysUser sysUser = new SysUser();
        sysUser.setUsername("admin");
        sysUser.setPassword("admin");
        return sysUser;
    }

}
