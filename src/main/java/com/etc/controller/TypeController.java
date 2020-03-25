package com.etc.controller;

import com.etc.entity.Type;
import com.etc.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * (Type)表控制层
 *
 * @author makejava
 * @since 2020-03-14 09:08:16
 */
@Controller
@RequestMapping("type")
public class TypeController {
    /**
     * 服务对象
     */
    @Autowired
    private TypeService typeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Type selectOne(Integer id) {
        return this.typeService.queryById(id);
    }

}