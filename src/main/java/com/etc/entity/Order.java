package com.etc.entity;

import java.io.Serializable;

/**
 * (Order)实体类
 *
 * @author makejava
 * @since 2020-03-18 15:54:15
 */
public class Order implements Serializable {
    private static final long serialVersionUID = 315608468861990140L;
    /**
     * 订单编号
     */
    private Integer oid;
    /**
     * 0：待发货 1：自取 2：已完成 3：待配送
     */
    private Integer productstate;

    private Integer sid;

    /**
     * 提取码
     */
    private String cod;

    private String address;

    private String phone;

    private String blessing;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getProductstate() {
        return productstate;
    }

    public void setProductstate(Integer productstate) {
        this.productstate = productstate;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBlessing() {
        return blessing;
    }

    public void setBlessing(String blessing) {
        this.blessing = blessing;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", productstate=" + productstate +
                ", sid=" + sid +
                ", cod='" + cod + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", blessing='" + blessing + '\'' +
                '}';
    }
}