package com.example.plusfenye.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.plusfenye.entity.Book;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author qmh
 * @since 2019-07-28
 */
public interface IBookService extends IService<Book> {

    IPage sele();
}
