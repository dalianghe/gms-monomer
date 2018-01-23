package com.github.dalianghe.web.controller.menu;

import com.github.dalianghe.admin.menu.entity.Menu;
import com.github.dalianghe.admin.menu.service.MenuService;
import com.github.dalianghe.web.controller.BaseController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by admin on 2018/1/17.
 */
@Controller
@RequestMapping(value = "/admin/menu")
public class MenuController extends BaseController<MenuService , Menu>{


    @RequestMapping(value = "",method = RequestMethod.GET)
    public String menu(){
        return "menu/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<Menu> list(String title) {
        Example example = new Example(Menu.class);
        if (StringUtils.isNotBlank(title))
            example.createCriteria().andLike("title", "%" + title + "%");
        return service.selectByExample(example);
    }

}
