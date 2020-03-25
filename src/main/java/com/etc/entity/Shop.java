package com.etc.entity;

import java.io.Serializable;

/**
 * (Shop)实体类
 *
 * @author makejava
 * @since 2020-03-14 09:08:16
 */
public class Shop implements Serializable {
    private static final long serialVersionUID = -58762671164380181L;
    /**
     * id
     */
    private Integer id;
    /**
     * 用户id
     */
    private Integer uid;
    /**
     * 商品id
     */
    private Integer pid;
    /**1
     * 0：未添加到购物车 1：添加到购物车
     */
    private Integer torf;
    /**
     * 商品数量
     */
    private Integer number;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getTorf() {
        return torf;
    }

    public void setTorf(Integer torf) {
        this.torf = torf;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", uid=" + uid +
                ", pid=" + pid +
                ", torf=" + torf +
                ", number=" + number +
                '}';
    }
}