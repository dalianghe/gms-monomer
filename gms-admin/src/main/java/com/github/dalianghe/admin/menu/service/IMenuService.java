package com.github.dalianghe.admin.menu.service;

import com.github.dalianghe.admin.menu.entity.Menu;

import java.util.List;

/**
 * Created by admin on 2018/1/17.
 */
public interface IMenuService {

    /**
     * 获取用户可以访问的菜单
     * @param id
     * @return
     */
    public List<Menu> getUserAuthorityMenuByUserId(int id);

}
