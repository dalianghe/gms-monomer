package com.github.dalianghe.web.controller.user;

import com.github.dalianghe.admin.user.entity.User;
import com.github.dalianghe.admin.user.service.UserService;
import com.github.dalianghe.common.msg.ObjectRestResponse;
import com.github.dalianghe.common.msg.TableResultResponse;
import com.github.dalianghe.web.controller.BaseController;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Example;

/**
 * Created by admin on 2018/1/21.
 */
@Controller
@RequestMapping(value = "/admin/user")
public class UserController extends BaseController<UserService , User> {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String user(){
        return "user/list";
    }

    @RequestMapping(value = "/edit",method = RequestMethod.GET)
    public String userEdit(){
        return "user/edit";
    }

    @RequestMapping(value = "/page",method = RequestMethod.GET)
    @ResponseBody
    public TableResultResponse<User> page(@RequestParam(defaultValue = "10") int limit, @RequestParam(defaultValue = "1") int offset, String name){
        Example example = new Example(User.class);
        if(StringUtils.isNotBlank(name)) {
            example.createCriteria().andLike("name", "%" + name + "%");
            example.createCriteria().andLike("username", "%" + name + "%");
        }
        int count = service.selectCountByExample(example);
        PageHelper.startPage(offset, limit);
        return new TableResultResponse<User>(count,service.selectByExample(example));
    }

}
