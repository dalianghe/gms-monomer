package com.github.dalianghe.web.controller.group;

import com.github.dalianghe.admin.group.entity.Group;
import com.github.dalianghe.admin.group.service.GroupService;
import com.github.dalianghe.web.controller.BaseController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin/group")
public class GroupController extends BaseController<GroupService , Group> {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String menu(){
        return "group/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<Group> list(String name, String groupType) {
        if(StringUtils.isBlank(name)&&StringUtils.isBlank(groupType))
            return new ArrayList<Group>();
        Example example = new Example(Group.class);
        if (StringUtils.isNotBlank(name))
            example.createCriteria().andLike("name", "%" + name + "%");
        if (StringUtils.isNotBlank(groupType))
            example.createCriteria().andEqualTo("groupType", groupType);

        return service.selectByExample(example);
    }

    @RequestMapping(value = "/edit",method = RequestMethod.GET)
    public String userEdit(){
        return "group/edit";
    }

}
