package com.github.dalianghe.user.service;

import com.github.dalianghe.user.entity.SysUser;

/**
 * Created by admin on 2018/1/12.
 */
public interface IUserService {

    public SysUser getSysUserByUsername(String username);

}
