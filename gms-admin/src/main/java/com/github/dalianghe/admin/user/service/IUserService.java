package com.github.dalianghe.admin.user.service;

import com.github.dalianghe.admin.user.entity.UserEntity;

/**
 * Created by admin on 2018/1/12.
 */
public interface IUserService {

    public UserEntity getSysUserByUsername(String username);

}
