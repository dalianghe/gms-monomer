package com.github.dalianghe.admin.menu.service;

import com.github.dalianghe.admin.menu.entity.Menu;
import com.github.dalianghe.admin.menu.mapper.MenuMapper;
import com.github.dalianghe.common.service.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2018/1/21.
 */
@Slf4j
@Service
public class MenuService extends BaseService<MenuMapper,Menu> {

    public List<Menu> getUserAuthorityMenuByUserId(int id) {
        return mapper.selectAuthorityMenuByUserId(id);
    }

}
