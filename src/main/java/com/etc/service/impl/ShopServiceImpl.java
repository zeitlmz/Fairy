package com.etc.service.impl;

import com.etc.dao.ShopDao;
import com.etc.entity.Shop;
import com.etc.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Shop)表服务实现类
 *
 * @author makejava
 * @since 2020-03-14 09:08:16
 */
@Service("shopService")
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopDao shopDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Shop queryById(Integer id) {
        return this.shopDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Shop> queryAllByLimit(int offset, int limit) {
        return this.shopDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param shop 实例对象
     * @return 实例对象
     */
    @Override
    public boolean insert(Shop shop) {
        int i=shopDao.insert(shop);
        return i==1?true:false;
    }

    /**
     * 修改数据
     *
     * @param shop 实例对象
     * @return 实例对象
     */
    @Override
    public Shop update(Shop shop) {
        this.shopDao.update(shop);
        return this.queryById(shop.getId());
    }

    /**
     * 通过主键删除数据
     *1
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.shopDao.deleteById(id) > 0;
    }

    @Override
    public boolean insert() {
        return false;
    }
}