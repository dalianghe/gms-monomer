package com.github.dalianghe.ui.security.biz;

import com.github.dalianghe.admin.user.entity.UserEntity;
import com.github.dalianghe.admin.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 2018/1/13.
 */
@Service
public class AuthUserDetailsService implements UserDetailsService {

    @Autowired
    private IUserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (StringUtils.isEmpty(username)) {
            throw new UsernameNotFoundException("用户名为空");
        }
        UserEntity sysUser = userService.getSysUserByUsername(username);
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        return new org.springframework.security.core.userdetails.User(username, sysUser.getPassword(),
                true, // 是否可用
                true, // 是否过期
                true, // 证书不过期为true
                true, // 账户未锁定为true
                authorities);
    }
}
