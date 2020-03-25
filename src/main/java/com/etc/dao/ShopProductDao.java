package com.etc.dao;

import com.etc.entity.vo.ShopProduct;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ShopProductDao {
    /**
     * 根据uid进行查询
     */
    @Select("select s.number,image,productname,price from shop s join product p on s.pid=p.pid where uid=#{uid}")
    List<ShopProduct> findAllById(Integer uid);

}
