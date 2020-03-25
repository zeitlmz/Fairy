package com.etc.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * (Type)实体类
 *
 * @author makejava
 * @since 2020-03-14 09:08:16
 */
@Repository
public class Type implements Serializable {
    private static final long serialVersionUID = 453411302429318710L;
    /**
     * 类型id
     */
    private Integer tid;
    /**
     * 类型名字
     */
    private String typename;


    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

}