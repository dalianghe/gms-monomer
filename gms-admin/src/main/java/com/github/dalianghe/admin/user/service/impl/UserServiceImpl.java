package com.github.dalianghe.admin.user.service.impl;

import com.github.dalianghe.admin.user.entity.UserEntity;
import com.github.dalianghe.admin.user.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2018/1/12.
 */
@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public UserEntity getSysUserByUsername(String username) {
        log.info("username:{}",username);
        UserEntity sysUser = new UserEntity();
        sysUser.setUsername("admin");
        sysUser.setPassword("admin");
        return sysUser;
    }

}
