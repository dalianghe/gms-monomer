package com.github.dalianghe.admin.user.service.impl;

import com.github.dalianghe.admin.user.entity.User;
import com.github.dalianghe.admin.user.mapper.UserMapper;
import com.github.dalianghe.admin.user.service.IUserService;
import com.github.dalianghe.common.service.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2018/1/12.
 */
@Slf4j
@Service
public class UserServiceImpl extends BaseService<UserMapper,User> implements IUserService {

    @Override
    public User getSysUserByUsername(String username) {
        User user = new User();
        user.setUsername(username);
        return mapper.selectOne(user);
    }

}
