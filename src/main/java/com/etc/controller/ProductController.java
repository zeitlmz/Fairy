package com.etc.controller;

import com.etc.entity.Product;
import com.etc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * (Product)表控制层
 *
 * @author makejava
 * @since 2020-03-14 09:08:16
 */
@CrossOrigin
@Controller
@RequestMapping("product")
public class ProductController {
    /**
     * 服务对象
     */
    @Autowired
    private ProductService productService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Product selectOne(Integer id) {
        return this.productService.queryById(id);
    }


    @RequestMapping("/findAll")
    @ResponseBody
    public List<Product> finAll(){
        List<Product> products=productService.findAll();


        return products;
    }

}