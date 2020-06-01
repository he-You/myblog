package com.heyou.myblog.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author heyou
 * @since 2020-05-31 00:18:06
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -14727508665019530L;

    private Long sn;
    
    private String id;
    
    private String username;
    
    private String avatar;
    
    private String email;
    
    private String password;
    
    private Integer status;
    
    private Date created;
    
    private Date lastLogin;

}