package com.etc.service.impl;

import com.etc.dao.ShopProductDao;
import com.etc.entity.vo.ShopProduct;
import com.etc.service.ShopProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopProductServiceImpl implements ShopProductService {

    @Autowired
    private ShopProductDao shopProductDao;

    @Override
    public List<ShopProduct> findAllByUid(Integer uid) {
        return shopProductDao.findAllById(uid);
    }
}
