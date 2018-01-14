package com.github.dalianghe.admin.user.service;

import com.github.dalianghe.admin.user.entity.User;

/**
 * Created by admin on 2018/1/12.
 */
public interface IUserService {

    public User getSysUserByUsername(String username);

}
