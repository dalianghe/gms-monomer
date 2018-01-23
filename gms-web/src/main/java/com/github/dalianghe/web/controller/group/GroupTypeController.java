package com.github.dalianghe.web.controller.group;

import com.github.dalianghe.admin.group.entity.GroupType;
import com.github.dalianghe.admin.group.service.GroupTypeService;
import com.github.dalianghe.web.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/grouptype")
public class GroupTypeController extends BaseController<GroupTypeService , GroupType> {
}
