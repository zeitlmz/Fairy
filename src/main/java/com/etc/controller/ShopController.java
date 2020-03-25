package com.etc.controller;

import com.etc.entity.Shop;
import com.etc.entity.User;
import com.etc.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


/**
 * (Shop)表控制层
 *
 * @author makejava
 * @since 2020-03-14 09:08:16
 */
@Controller
@RequestMapping("/shop")
public class ShopController {
    /** 1
     * 服务对象
     */
    @Autowired
    private ShopService shopService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public Shop selectOne(Integer id) {
        return this.shopService.queryById(id);
    }


    /**
     * @param request
     * @param pid
     * @return
     */
    @RequestMapping("/addShop")
    public String addShop(HttpServletRequest request, Integer pid) {
//        1.获取当前用户id
        User user = (User) request.getSession().getAttribute("user");
//        2.将数据存入数据库

        Integer uid = user.getUid();
        Shop shop = new Shop();
        shop.setUid(uid);
        shop.setPid(pid);

        shop.setTorf(1);
//        shop.setProductstate(3);
        shopService.insert(shop);

        return "success";
    }

//    @RequestMapping("/state1")
//    public String shopState1(HttpServletRequest request, int pid) {
//
//        User user = (User) request.getSession().getAttribute("user");
//
//        Shop shop = new Shop();
//
//        shop.setTorf(0);
//        shop.setProductstate(1);
//        String code = "abcdefghijklmnopqrstuvwxyz1234567890";
//        String codes = "";
//        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//
//
//            codes += code.charAt(random.nextInt(code.length() - 1));
//        }
//        shopService.insert(shop);
//        return "success";
//    }
//
//
//    @RequestMapping("/state2")
//    public String shopState2(HttpServletRequest request, Integer pid) {
////        User user = (User) request.getSession().getAttribute("user");
////        Integer uid = user.getUid();
//        Shop shop = new Shop();
//        shop.setUid(new Integer(1));
//        shop.setPid(new Integer(1));
//        shop.setTorf(0);
//        shop.setProductstate(2);
//        shopService.insert(shop);
//        return "success";
//    }

    @RequestMapping("/deleteById")
    public String deleteById(HttpServletRequest request, int id) {
        shopService.deleteById(id);
        return "success";
    }
}

