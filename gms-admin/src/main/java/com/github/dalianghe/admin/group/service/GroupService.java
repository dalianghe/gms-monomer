package com.github.dalianghe.admin.group.service;

import com.github.dalianghe.admin.group.entity.Group;
import com.github.dalianghe.admin.group.mapper.GroupMapper;
import com.github.dalianghe.common.service.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GroupService extends BaseService<GroupMapper, Group> {
}
