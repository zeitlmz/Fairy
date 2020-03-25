package com.etc.dao;

import com.etc.entity.Shop;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Shop)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-14 09:08:16
 */
@Repository
public interface ShopDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Shop queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Shop> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param shop 实例对象
     * @return 对象列表
     */
    List<Shop> queryAll(Shop shop);

    /**
     * 新增数据
     *
     * @param shop 实例对象
     * @return 影响行数
     */

    @Insert("insert into shop(uid,pid,torf,number) values(#{uid},#{pid},#{torf},#{number})")
    int insert(Shop shop);

    /**1
     * 修改数据
     *
     * @param shop 实例对象
     * @return 影响行数
     */
    int update(Shop shop);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    @Delete("delete from shop where id=#{id}")
    int deleteById(Integer id);

}