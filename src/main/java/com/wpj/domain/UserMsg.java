/*
 * Copyright (c) 2017 wupj e-mail:wpjlovehome@gmail.com
 */

package com.wpj.domain;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * The type User msg.
 */
@Table(name = "user_msg")
public class UserMsg extends BaseDomain{
    private static final long serialVersionUID = -427726280222309927L;
    /**
     * id .
     */
    @Column(name = "id")
    @Id
    @GeneratedValue(generator = "UUID")
    private String id;
    /**
     * 用户名.
     */
    @Column(name = "user_name")
    private String userName;
    /**
     * 密码.
     */
    @Column(name = "user_pwd")
    private String userPwd;

    /**
     * 是否在线.
     */
    @Column(name = "user_activity")
    private Boolean userActivity;
    /**
     * 最后登录时间.
     */
    @Column(name = "user_last_login")
    private Date userLastLogin;
    /**
     * 用户座右铭.
     */
    @Column(name = "user_motto")

    private String userMotto;

    /**
     * Gets id.
     *
     * @return id id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * Gets user name.
     *
     * @return user_name user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(final String userName) {
        this.userName = userName;
    }

    /**
     * Gets user pwd.
     *
     * @return user_pwd user pwd
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * Sets user pwd.
     *
     * @param userPwd the user pwd
     */
    public void setUserPwd(final String userPwd) {
        this.userPwd = userPwd;
    }

    /**
     * 获取是否在线.
     *
     * @return user_activity - 是否在线
     */
    public Boolean getUserActivity() {
        return userActivity;
    }

    /**
     * 设置是否在线.
     *
     * @param userActivity 是否在线
     */
    public void setUserActivity(final Boolean userActivity) {
        this.userActivity = userActivity;
    }

    /**
     * Gets user last login.
     *
     * @return user_last_login user last login
     */
    public Date getUserLastLogin() {
        return userLastLogin;
    }

    /**
     * Sets user last login.
     *
     * @param userLastLogin the user last login
     */
    public void setUserLastLogin(final Date userLastLogin) {
        this.userLastLogin = userLastLogin;
    }

    /**
     * Gets user motto.
     *
     * @return the user motto
     */
    public String getUserMotto() {
        return userMotto;
    }

    /**
     * Sets user motto.
     *
     * @param userMotto the user motto
     */
    public void setUserMotto(String userMotto) {
        this.userMotto = userMotto;
    }

    @Override
    public String toString() {
        return "UserMsg{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userActivity=" + userActivity +
                ", userLastLogin=" + userLastLogin +
                '}';
    }
}