package com.etc.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * (Admin)实体类
 *
 * @author makejava
 * @since 2020-03-14 09:08:16
 */
@Repository
public class Admin implements Serializable {
    private static final long serialVersionUID = 150535853521887695L;
    /**
     * id
     */
    private Integer id;
    /**
     * 账户
     */
    private String username;
    /**
     * 密码
     */
    private String password;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}