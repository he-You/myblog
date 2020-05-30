package com.heyou.myblog.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author heyou
 * @since 2020-05-31 00:18:06
 */
public class User implements Serializable {
    private static final long serialVersionUID = -14727508665019530L;
    
    private Long id;
    
    private String username;
    
    private String avatar;
    
    private String email;
    
    private String password;
    
    private Integer status;
    
    private Date created;
    
    private Date lastLogin;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

}