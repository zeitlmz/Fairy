package com.etc.controller;

import com.etc.entity.Order;
import com.etc.entity.Shop;
import com.etc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;

/**
 * (Order)表控制层
 *
 * @author makejava
 * @since 2020-03-18 15:54:15
 */
@Controller
@RequestMapping("order")
public class OrderController {
    /**
     * 服务对象
     */
    @Autowired
    private OrderService orderService;

//    /**
//     * 通过主键查询单条数据
//     *
//     * @param id 主键
//     * @return 单条数据
//     */
    /**
     * 通过主键查询单条数据
     *
     * @param pid 主键
     * @return 单条数据
     */

//    @GetMapping("selectOne")
//    public Order selectOne( id) {
//        return this.orderService.queryById(id);
//    }

    @RequestMapping("/state1")
    public String orderState1(HttpServletRequest request, Integer pid, Integer number, String blessing, String phone) {

        this.shop(request, pid, number);

        Order order = new Order();
        order.setProductstate(1);
        order.setBlessing(new String("rsfadsdf"));
        order.setPhone(new String("123213"));
        String cod = "abcdefghijklmnopqrstuvwxyz1234567890";
        String cods = "";
        Random random = new Random();
        for (int i = 0; i < 10; i++) {

            cods += cod.charAt(random.nextInt(cod.length() - 1));
        }
        order.setCod(cods);
        orderService.insert(order);
        return "success";
    }


    @RequestMapping("/state2")
    public String orderState2(HttpServletRequest request, Integer pid, Integer number, String address, String blessing, String phone) {

        this.shop(request, pid, number);
        Order order = new Order();
        order.setProductstate(2);
        order.setSid(new Integer(1));
        order.setAddress(new String("oiwruoeir"));
        order.setBlessing(new String("rsfadsdf"));
        order.setPhone(new String("123213"));
        System.out.println(order);
        orderService.insert(order);
        return "success";
    }

    public void shop(HttpServletRequest request, Integer pid, Integer number) {
//        User user = (User) request.getSession().getAttribute("user");
//        Integer uid = user.getUid();
        Shop shop = new Shop();
        shop.setUid(new Integer(1));
        shop.setPid(new Integer(1));
        shop.setTorf(0);
    }

}