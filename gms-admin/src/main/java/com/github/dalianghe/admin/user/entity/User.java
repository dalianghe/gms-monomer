package com.github.dalianghe.admin.user.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "base_user")
public class User {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 出生日期
     */
    private String birthday;

    /**
     * 地址
     */
    private String address;

    /**
     * 手机号
     */
    @Column(name = "mobile_phone")
    private String mobilePhone;

    /**
     * 电话
     */
    @Column(name = "tel_phone")
    private String telPhone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 性别
     */
    private String sex;

    /**
     * 类型
     */
    private String type;

    /**
     * 状态
     */
    private String status;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间
     */
    @Column(name = "crt_time")
    private Date crtTime;

    /**
     * 创建人ID
     */
    @Column(name = "crt_user")
    private Integer crtUser;

    /**
     * 创建人姓名
     */
    @Column(name = "crt_name")
    private String crtName;

    /**
     * 创建人IP
     */
    @Column(name = "crt_host")
    private String crtHost;

    /**
     * 更新时间
     */
    @Column(name = "upd_time")
    private Date updTime;

    /**
     * 更新人ID
     */
    @Column(name = "upd_user")
    private Integer updUser;

    /**
     * 更新人姓名
     */
    @Column(name = "upd_name")
    private String updName;

    /**
     * 更新人IP
     */
    @Column(name = "upd_host")
    private String updHost;

    /**
     * 预留字段1
     */
    private String attr1;

    /**
     * 预留字段2
     */
    private String attr2;

    /**
     * 预留字段3
     */
    private String attr3;

    /**
     * 预留字段4
     */
    private String attr4;

    /**
     * 预留字段5
     */
    private String attr5;

    /**
     * 预留字段6
     */
    private String attr6;

    /**
     * 预留字段7
     */
    private String attr7;

    /**
     * 预留字段8
     */
    private String attr8;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取用户密码
     *
     * @return password - 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     *
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户姓名
     *
     * @return name - 用户姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户姓名
     *
     * @param name 用户姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取出生日期
     *
     * @return birthday - 出生日期
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置出生日期
     *
     * @param birthday 出生日期
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取手机号
     *
     * @return mobile_phone - 手机号
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * 设置手机号
     *
     * @param mobilePhone 手机号
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * 获取电话
     *
     * @return tel_phone - 电话
     */
    public String getTelPhone() {
        return telPhone;
    }

    /**
     * 设置电话
     *
     * @param telPhone 电话
     */
    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取类型
     *
     * @return type - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取创建时间
     *
     * @return crt_time - 创建时间
     */
    public Date getCrtTime() {
        return crtTime;
    }

    /**
     * 设置创建时间
     *
     * @param crtTime 创建时间
     */
    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    /**
     * 获取创建人ID
     *
     * @return crt_user - 创建人ID
     */
    public Integer getCrtUser() {
        return crtUser;
    }

    /**
     * 设置创建人ID
     *
     * @param crtUser 创建人ID
     */
    public void setCrtUser(Integer crtUser) {
        this.crtUser = crtUser;
    }

    /**
     * 获取创建人姓名
     *
     * @return crt_name - 创建人姓名
     */
    public String getCrtName() {
        return crtName;
    }

    /**
     * 设置创建人姓名
     *
     * @param crtName 创建人姓名
     */
    public void setCrtName(String crtName) {
        this.crtName = crtName;
    }

    /**
     * 获取创建人IP
     *
     * @return crt_host - 创建人IP
     */
    public String getCrtHost() {
        return crtHost;
    }

    /**
     * 设置创建人IP
     *
     * @param crtHost 创建人IP
     */
    public void setCrtHost(String crtHost) {
        this.crtHost = crtHost;
    }

    /**
     * 获取更新时间
     *
     * @return upd_time - 更新时间
     */
    public Date getUpdTime() {
        return updTime;
    }

    /**
     * 设置更新时间
     *
     * @param updTime 更新时间
     */
    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }

    /**
     * 获取更新人ID
     *
     * @return upd_user - 更新人ID
     */
    public Integer getUpdUser() {
        return updUser;
    }

    /**
     * 设置更新人ID
     *
     * @param updUser 更新人ID
     */
    public void setUpdUser(Integer updUser) {
        this.updUser = updUser;
    }

    /**
     * 获取更新人姓名
     *
     * @return upd_name - 更新人姓名
     */
    public String getUpdName() {
        return updName;
    }

    /**
     * 设置更新人姓名
     *
     * @param updName 更新人姓名
     */
    public void setUpdName(String updName) {
        this.updName = updName;
    }

    /**
     * 获取更新人IP
     *
     * @return upd_host - 更新人IP
     */
    public String getUpdHost() {
        return updHost;
    }

    /**
     * 设置更新人IP
     *
     * @param updHost 更新人IP
     */
    public void setUpdHost(String updHost) {
        this.updHost = updHost;
    }

    /**
     * 获取预留字段1
     *
     * @return attr1 - 预留字段1
     */
    public String getAttr1() {
        return attr1;
    }

    /**
     * 设置预留字段1
     *
     * @param attr1 预留字段1
     */
    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    /**
     * 获取预留字段2
     *
     * @return attr2 - 预留字段2
     */
    public String getAttr2() {
        return attr2;
    }

    /**
     * 设置预留字段2
     *
     * @param attr2 预留字段2
     */
    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    /**
     * 获取预留字段3
     *
     * @return attr3 - 预留字段3
     */
    public String getAttr3() {
        return attr3;
    }

    /**
     * 设置预留字段3
     *
     * @param attr3 预留字段3
     */
    public void setAttr3(String attr3) {
        this.attr3 = attr3;
    }

    /**
     * 获取预留字段4
     *
     * @return attr4 - 预留字段4
     */
    public String getAttr4() {
        return attr4;
    }

    /**
     * 设置预留字段4
     *
     * @param attr4 预留字段4
     */
    public void setAttr4(String attr4) {
        this.attr4 = attr4;
    }

    /**
     * 获取预留字段5
     *
     * @return attr5 - 预留字段5
     */
    public String getAttr5() {
        return attr5;
    }

    /**
     * 设置预留字段5
     *
     * @param attr5 预留字段5
     */
    public void setAttr5(String attr5) {
        this.attr5 = attr5;
    }

    /**
     * 获取预留字段6
     *
     * @return attr6 - 预留字段6
     */
    public String getAttr6() {
        return attr6;
    }

    /**
     * 设置预留字段6
     *
     * @param attr6 预留字段6
     */
    public void setAttr6(String attr6) {
        this.attr6 = attr6;
    }

    /**
     * 获取预留字段7
     *
     * @return attr7 - 预留字段7
     */
    public String getAttr7() {
        return attr7;
    }

    /**
     * 设置预留字段7
     *
     * @param attr7 预留字段7
     */
    public void setAttr7(String attr7) {
        this.attr7 = attr7;
    }

    /**
     * 获取预留字段8
     *
     * @return attr8 - 预留字段8
     */
    public String getAttr8() {
        return attr8;
    }

    /**
     * 设置预留字段8
     *
     * @param attr8 预留字段8
     */
    public void setAttr8(String attr8) {
        this.attr8 = attr8;
    }
}