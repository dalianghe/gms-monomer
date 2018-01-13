package com.github.dalianghe.admin.user.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by admin on 2018/1/12.
 */
@ToString
public class UserEntity implements Serializable {

    @Getter @Setter private Long id;
    @Getter @Setter private String username;
    @Getter @Setter private String password;

}
