package com.etc.controller;

import com.etc.entity.Account;
import com.etc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * (Account)表控制层
 *
 * @author makejava
 * @since 2020-03-14 09:08:16
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    /**
     * 服务对象
     */
    @Autowired
    private AccountService accountService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public Account selectOne(Integer id) {
        System.out.println(id);
        return this.accountService.queryById(id);
    }

    @RequestMapping("/findAll")
    public String findAll() {
        List<Account> accounts = accountService.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
        return "success";
    }

    @RequestMapping("/transfer")
    public String transfer(String username,String password,double sum){
        accountService.transfer(username,password,sum);
        return "success";
    }
}