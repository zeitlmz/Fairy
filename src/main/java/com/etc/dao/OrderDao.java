package com.etc.dao;

import com.etc.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * (Order)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-18 15:54:15
 */
public interface OrderDao {

    /**
     * 通过ID查询单条数据
     *
     * @param 主键
     * @return 实例对象
     */
    Order queryById();

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Order> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param order 实例对象
     * @return 对象列表
     */
    List<Order> queryAll(Order order);

    /**
     * 新增数据
     *
     * @param order 实例对象
     * @return 影响行数
     */
    @Insert("insert into taborder (productstate,sid,address,blessing,phone,cod) values(#{productstate},#{sid},#{address},#{blessing},#{phone},#{cod})")
    int insert(Order order);

    /**
     * 修改数据
     *
     * @param order 实例对象
     * @return 影响行数
     */
    int update(Order order);

    /**
     * 通过主键删除数据
     *
     * @param
     * @return 影响行数
     */
    int deleteById();




    @Select("select * from taborder where cod is not NULL")
    List<Order> findByCod();

    @Select("select * from taborder where productstate=#{productstate}")
    List<Order> findByState(Integer productstate);

}