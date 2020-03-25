package com.etc.service.impl;

import com.etc.dao.ClerkDao;
import com.etc.entity.Clerk;
import com.etc.service.ClerkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Clerk)表服务实现类
 *
 * @author makejava
 * @since 2020-03-14 09:08:16
 */
@Service("clerkService")
public class ClerkServiceImpl implements ClerkService {
    @Autowired
    private ClerkDao clerkDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Clerk queryById(Integer id) {
        return this.clerkDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Clerk> queryAllByLimit(int offset, int limit) {
        return this.clerkDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param clerk 实例对象
     * @return 实例对象
     */
    @Override
    public Clerk insert(Clerk clerk) {
        this.clerkDao.insert(clerk);
        return clerk;
    }

    /**
     * 修改数据
     *
     * @param clerk 实例对象
     * @return 实例对象
     */
    @Override
    public Clerk update(Clerk clerk) {
        this.clerkDao.update(clerk);
        return this.queryById(clerk.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.clerkDao.deleteById(id) > 0;
    }
}