package com.etc.service;

import com.etc.entity.vo.ShopProduct;

import java.util.List;

public interface ShopProductService {
    /**
     * 根据uid进行查询
     */
    List<ShopProduct> findAllByUid(Integer uid);
}
