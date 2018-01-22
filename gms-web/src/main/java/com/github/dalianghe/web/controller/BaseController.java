package com.github.dalianghe.web.controller;

import com.github.dalianghe.admin.user.entity.User;
import com.github.dalianghe.common.msg.ObjectRestResponse;
import com.github.dalianghe.common.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class BaseController <Service extends BaseService,Entity> {

    @Autowired
    protected HttpServletRequest request;
    @Autowired
    protected Service service;

    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseBody
    public ObjectRestResponse<User> add(Entity entity){
        service.insertSelective(entity);
        return new ObjectRestResponse<User>().rel(true);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse<Entity> get(@PathVariable int id){
        return new ObjectRestResponse<Entity>().rel(true).result(service.selectById(id));
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse<Entity> update(Entity entity){
        service.updateSelectiveById(entity);
        return new ObjectRestResponse<Entity>().rel(true);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public ObjectRestResponse<Entity> remove(@PathVariable int id){
        service.deleteById(id);
        return new ObjectRestResponse<Entity>().rel(true);
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    @ResponseBody
    public List<Entity> list(){
        return service.selectListAll();
    }

}
