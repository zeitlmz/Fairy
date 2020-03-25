package com.etc.service.impl;

import com.etc.dao.TypeDao;
import com.etc.entity.Type;
import com.etc.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Type)表服务实现类
 *
 * @author makejava
 * @since 2020-03-14 09:08:16
 */
@Service("typeService")
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeDao typeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param tid 主键
     * @return 实例对象
     */
    @Override
    public Type queryById(Integer tid) {
        return this.typeDao.queryById(tid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Type> queryAllByLimit(int offset, int limit) {
        return this.typeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param type 实例对象
     * @return 实例对象
     */
    @Override
    public Type insert(Type type) {
        this.typeDao.insert(type);
        return type;
    }

    /**
     * 修改数据
     *
     * @param type 实例对象
     * @return 实例对象
     */
    @Override
    public Type update(Type type) {
        this.typeDao.update(type);
        return this.queryById(type.getTid());
    }

    /**
     * 通过主键删除数据
     *
     * @param tid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer tid) {
        return this.typeDao.deleteById(tid) > 0;
    }
}