package com.github.dalianghe.web.controller.menu;

import com.alibaba.fastjson.JSONObject;
import com.github.dalianghe.admin.menu.entity.Menu;
import com.github.dalianghe.admin.menu.service.MenuService;
import com.github.dalianghe.admin.menu.vo.MenuTree;
import com.github.dalianghe.common.utils.TreeUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2018/1/17.
 */
@RestController
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/admin/user/menu", method = RequestMethod.GET)
    public String getMenusByUsername(){
        return JSONObject.toJSONString(getMenuTree(menuService.getUserAuthorityMenuByUserId(1), 13));
    }


    private List<MenuTree> getMenuTree(List<Menu> menus, int root) {
        List<MenuTree> trees = new ArrayList<MenuTree>();
        MenuTree node = null;
        for (Menu menu : menus) {
            node = new MenuTree();
            BeanUtils.copyProperties(menu, node);
            trees.add(node);
        }
        return TreeUtil.bulid(trees, root) ;
    }
}
