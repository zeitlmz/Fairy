package com.etc.entity;

import java.io.Serializable;

/**
 * (Clerk)实体类
 *
 * @author makejava
 * @since 2020-03-14 09:08:16
 */
public class Clerk implements Serializable {
    private static final long serialVersionUID = 244723594656754738L;
    /**
     * id
     */
    private Integer id;
    /**
     * 账号
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 手机号
     */
    private String phonenumber;
    /**
     * 姓名
     */
    private String name;
    /**
     * 身份证号
     */
    private String idnumber;
    /**
     * 性别
     */
    private String gender;
    /**
     * 邮箱
     */
    private String email;


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

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Clerk{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phonenumber=" + phonenumber +
                ", name='" + name + '\'' +
                ", idnumber=" + idnumber +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}