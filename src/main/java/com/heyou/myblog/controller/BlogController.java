package com.heyou.myblog.controller;

import com.heyou.myblog.entity.Blog;
import com.heyou.myblog.service.IBlogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Blog)表控制层
 *
 * @author heyou
 * @since 2020-05-31 00:18:34
 */
@RestController
@RequestMapping("mBlog")
public class BlogController {
    /**
     * 服务对象
     */
    @Resource
    private IBlogService iBlogService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Blog selectOne(Long id) {
        return this.iBlogService.queryById(id);
    }

}