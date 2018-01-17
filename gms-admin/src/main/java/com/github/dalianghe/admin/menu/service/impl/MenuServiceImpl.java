package com.github.dalianghe.admin.menu.service.impl;

import com.github.dalianghe.admin.menu.entity.Menu;
import com.github.dalianghe.admin.menu.mapper.MenuMapper;
import com.github.dalianghe.admin.menu.service.IMenuService;
import com.github.dalianghe.common.service.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2018/1/17.
 */
@Slf4j
@Service
public class MenuServiceImpl extends BaseService<MenuMapper,Menu> implements IMenuService {

    @Override
    public List<Menu> getUserAuthorityMenuByUserId(int id) {
        return mapper.selectAuthorityMenuByUserId(id);
    }
}
