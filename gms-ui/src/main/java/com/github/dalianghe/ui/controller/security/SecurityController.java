package com.github.dalianghe.ui.controller.security;

import com.github.dalianghe.admin.user.entity.User;
import com.github.dalianghe.admin.user.entity.UserEntity;
import com.github.dalianghe.admin.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2018/1/12.
 */
@RestController
public class SecurityController {

    @Autowired
    private IUserService userService;

    @GetMapping("/test")
    public String logout() throws Exception{
        User user = userService.getSysUserByUsername("");
        System.out.println(user.toString());
        //System.out.println("==================");
        return "hahahahaha";
    }

}
