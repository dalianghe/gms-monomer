package com.github.dalianghe.web.controller.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        log.info("进入登录页面...");
        return "login";
    }

    @RequestMapping({"","/index"})
    public String index(){
        return "/index";
    }

}
