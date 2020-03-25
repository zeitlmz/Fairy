package com.etc.service;

import com.etc.entity.Clerk;

import java.util.List;

/**
 * (Clerk)表服务接口
 *
 * @author makejava
 * @since 2020-03-14 09:08:16
 */
public interface ClerkService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Clerk queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Clerk> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param clerk 实例对象
     * @return 实例对象
     */
    Clerk insert(Clerk clerk);

    /**
     * 修改数据
     *
     * @param clerk 实例对象
     * @return 实例对象
     */
    Clerk update(Clerk clerk);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}