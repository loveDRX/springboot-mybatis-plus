package com.example.plusfenye.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.plusfenye.entity.Book;
import com.example.plusfenye.mapper.BookMapper;
import com.example.plusfenye.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qmh
 * @since 2019-07-28
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

    @Override
    public IPage sele() {
        QueryWrapper<Book> wrapper = new QueryWrapper<>();
        wrapper.orderByAsc("book_id");
        Page<Book> bookPage = new Page<>();
        bookPage.setCurrent(1);
        bookPage.setSize(5);
        IPage iPage = baseMapper.selectPage(bookPage, wrapper);
        System.out.println(iPage.getTotal());
        System.out.println(iPage.getRecords());
        return iPage;
    }
}
