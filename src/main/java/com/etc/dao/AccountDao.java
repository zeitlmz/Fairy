package com.etc.dao;

import com.etc.entity.Account;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Account)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-14 09:08:14
 */
@Repository
public interface AccountDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Account queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Account> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    @Select("select * from account")
    List<Account> queryAll();

    /**
     * 新增数据
     *
     * @param account 实例对象
     * @return 影响行数
     */
    int insert(Account account);

    /**
     * 修改数据
     *
     * @param account 实例对象
     * @return 影响行数
     */
    int update(Account account);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */

    int deleteById(Integer id);


    @Update("update account set money=money+#{money} where id=#{id}")
    int addUpdate(@Param("id") Integer id, double money);

    @Update("update account set money=money-#{money} where id=#{id}")
    int deleteUpdate(@Param("id") Integer id, double money);

    @Update("update account set money=money-#{money} where username=#{username} and password=#{password}")
    int delUpdate(@Param("username") String username, @Param("password") String password, double money);
}