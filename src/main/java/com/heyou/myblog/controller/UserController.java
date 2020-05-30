package com.heyou.myblog.controller;

import com.heyou.myblog.entity.User;
import com.heyou.myblog.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author heyou
 * @since 2020-05-31 00:18:06
 */
@RestController
@RequestMapping("mUser")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private IUserService iUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Long id) {
        return this.iUserService.queryById(id);
    }

}