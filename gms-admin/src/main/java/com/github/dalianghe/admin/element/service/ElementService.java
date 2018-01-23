package com.github.dalianghe.admin.element.service;

import com.github.dalianghe.admin.element.entity.Element;
import com.github.dalianghe.admin.element.mapper.ElementMapper;
import com.github.dalianghe.common.service.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ElementService extends BaseService<ElementMapper , Element> {
}
