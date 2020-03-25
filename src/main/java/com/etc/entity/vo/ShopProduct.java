package com.etc.entity.vo;

import com.etc.entity.Product;
import com.etc.entity.Shop;

public class ShopProduct extends Shop {
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ShopProduct{" +
                "product=" + product +
                '}';
    }
}
