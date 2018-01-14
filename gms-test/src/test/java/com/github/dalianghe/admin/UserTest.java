package com.github.dalianghe.admin;

import com.github.dalianghe.admin.user.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by admin on 2018/1/14.
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private IUserService userService;

    @Test
    public void testUser() throws Exception{
        log.info("=================="+userService.getSysUserByUsername("admin"));
    }

}
