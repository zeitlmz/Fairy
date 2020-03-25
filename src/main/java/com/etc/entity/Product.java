package com.etc.entity;

import java.io.Serializable;

/**
 * (Product)实体类
 *
 * @author makejava
 * @since 2020-03-14 09:08:16
 */
public class Product implements Serializable {
    private static final long serialVersionUID = 644706043590776659L;
    /**
     * 商品id
     */
    private Integer pid;
    /**
     * 商品名称
     */
    private String productname;
    /**
     * 价格
     */
    private Double price;
    /**
     * 图片
     */
    private String image;
    /**
     * 数量
     */
    private Integer number;
    /**
     * 上架时间
     */
    private Object launchdate;
    /**
     * 类型id
     */
    private Object tid;


    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Object getLaunchdate() {
        return launchdate;
    }

    public void setLaunchdate(Object launchdate) {
        this.launchdate = launchdate;
    }

    public Object getTid() {
        return tid;
    }

    public void setTid(Object tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", productname='" + productname + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                ", number=" + number +
                ", launchdate=" + launchdate +
                ", tid=" + tid +
                '}';
    }
}