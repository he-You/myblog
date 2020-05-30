package com.heyou.myblog.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Blog)实体类
 *
 * @author heyou
 * @since 2020-05-31 00:18:34
 */
public class Blog implements Serializable {
    private static final long serialVersionUID = 763522116976304977L;
    
    private Long id;
    
    private Long userId;
    
    private String title;
    
    private String description;
    
    private Object content;
    
    private Date created;
    
    private Object status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

}