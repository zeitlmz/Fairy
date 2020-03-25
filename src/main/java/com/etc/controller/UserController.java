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
        System.out.println(username);
        User user = userService.findByUsernameAndPassword(username, password);
        if (user != null){
            //那前端的其他网页怎么判断，这个用户名的session是否存在
            request.getSession().setAttribute("user",user);
            User user1= (User) request.getSession().getAttribute("user");
            System.out.println("成功");
            return user1;
        }else {
            System.out.println("失败");
            return user;
        }

    }


    @PostMapping("/insert")
    public ModelAndView insert(User user) {
        ModelAndView modelAndView = new ModelAndView();
        boolean isok = userService.insert(user);
        user.setJoindate(new Date());
        if (isok) {
            modelAndView.addObject("msg", "注册成功");
        } else {
            modelAndView.addObject("msg", "注册失败");
        }
        modelAndView.setViewName("success");
        return modelAndView;
    }
}