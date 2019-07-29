package com.example.plusfenye.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.plusfenye.entity.Book;
import com.example.plusfenye.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author qmh
 * @since 2019-07-28
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    IBookService iBookService;
    @RequestMapping("hello")
    public IPage hello(){
        IPage iPage=iBookService.sele();
//        List list = baseMapper.selectList(null);
        return iPage;
    }
}
