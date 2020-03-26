package com.etc.controller;

import com.etc.entity.User;
import com.etc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;


/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-03-14 09:08:16
 */
@CrossOrigin
@Controller
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Autowired
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @PostMapping("/selectOne")
    public User selectOne(Integer id) {
        return this.userService.queryById(id);
    }

    @RequestMapping("login")
    @ResponseBody
    public User login(String username, String password, HttpServletRequest request, HttpServletResponse response) throws IOException {
        return userService.findByUsernameAndPassword(username, password);
    }


    @RequestMapping("insert")
    @ResponseBody
    public boolean insert(String username,String email,String password,String phonenumber,String name) {
        User user=new User();
        user.setUsername(username);
        user.setName(name);
        user.setPhonenumber(phonenumber);
        user.setEmail(email);
        user.setPassword(password);
        return userService.insert(user);
    }
}