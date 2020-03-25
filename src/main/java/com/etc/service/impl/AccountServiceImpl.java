package com.etc.service.impl;

import com.etc.dao.AccountDao;
import com.etc.entity.Account;
import com.etc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Account)表服务实现类
 *
 * @author makejava
 * @since 2020-03-14 09:08:15
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Account queryById(Integer id) {
        return this.accountDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Account> queryAllByLimit(int offset, int limit) {
        return this.accountDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param account 实例对象
     * @return 实例对象
     */
    @Override
    public Account insert(Account account) {
        this.accountDao.insert(account);
        return account;
    }

    /**
     * 修改数据
     *
     * @param account 实例对象
     * @return 实例对象
     */
    @Override
    public Account update(Account account) {
        this.accountDao.update(account);
        return this.queryById(account.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.accountDao.deleteById(id) > 0;
    }

    @Override
    public List<Account> findAll() {
        return accountDao.queryAll();
    }

    /**
     * 根据id转账
     * @param id
     * @param sum
     * @return
     */
    @Override
    public boolean transfer(int id, double sum) {
//        accountDao.addUpdate(1,sum);
//        return accountDao.deleteUpdate(id,sum)>0;
        return false;
    }

    /**
     * 根据用户名密码转账
     * @param username
     * @param password
     * @param sum
     */
    @Override
    public void transfer(String username, String password, double sum) {
//        accountDao.addUpdate(1,sum);
//        accountDao.deleteUpdate(username,password,sum);
    }
}