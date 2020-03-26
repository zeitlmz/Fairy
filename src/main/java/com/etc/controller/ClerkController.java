package com.etc.controller;

import com.etc.entity.Clerk;
import com.etc.service.ClerkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * (Clerk)表控制层
 *
 * @author makejava
 * @since 2020-03-14 09:08:16
 */
@CrossOrigin
@Controller
@RequestMapping("clerk")
public class ClerkController {
    /**
     * 服务对象
     */
    @Autowired
    private ClerkService clerkService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Clerk selectOne(Integer id) {
        return this.clerkService.queryById(id);
    }



    @RequestMapping("insert")
    @ResponseBody
    public boolean insertClert(String name,String phonenumber,String idnumber,String email){
        Clerk clerk=new Clerk();
        clerk.setName(name);
        clerk.setPhonenumber(phonenumber);
        clerk.setIdnumber(idnumber);
        clerk.setEmail(email);
        return  clerkService.insert(clerk);
    }
}