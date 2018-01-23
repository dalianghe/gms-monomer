package com.github.dalianghe.web.controller.element;

import com.github.dalianghe.admin.element.entity.Element;
import com.github.dalianghe.admin.element.service.ElementService;
import com.github.dalianghe.common.msg.TableResultResponse;
import com.github.dalianghe.web.controller.BaseController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Controller
@RequestMapping("/admin/element")
public class ElementController extends BaseController<ElementService, Element> {

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    @ResponseBody
    public TableResultResponse<Element> page(@RequestParam(defaultValue = "10") int limit,
                                             @RequestParam(defaultValue = "1") int offset, String name, @RequestParam(defaultValue = "0") int menuId) {
        Example example = new Example(Element.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("menuId", menuId);
        if(StringUtils.isNotBlank(name)){
            criteria.andLike("name", "%" + name + "%");
        }
        List<Element> elements = service.selectByExample(example);
        return new TableResultResponse<Element>(elements.size(), elements);
    }

}
