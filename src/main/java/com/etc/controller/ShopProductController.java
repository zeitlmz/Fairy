package com.etc.controller;

import com.etc.entity.User;
import com.etc.entity.vo.ShopProduct;
import com.etc.service.ShopProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/shopProduct")
public class ShopProductController {

    @Autowired
    private ShopProductService shopProductService;

    /**
     * 购物车
     * @return
     */
    @RequestMapping("/findAllByUid")
    @ResponseBody
    public List<ShopProduct> finAllByUid(Integer uid){
        System.out.println(uid);

        List<ShopProduct> allByUid = shopProductService.findAllByUid(uid);

        return allByUid;
    }
}
