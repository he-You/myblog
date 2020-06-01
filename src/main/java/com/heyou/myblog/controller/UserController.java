package com.heyou.myblog.controller;

import com.google.common.base.Objects;
import com.heyou.myblog.constant.Enum.CodeEnum;
import com.heyou.myblog.bean.Result;
import com.heyou.myblog.requestInfo.ReqUser.ReqLogin;
import com.heyou.myblog.service.redis.RedisService;
import com.heyou.myblog.util.JwtUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author heyou
 * @date 2019/6/14 0014
 */
@Api("用户信息管理")
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private RedisService redisService;
    @Resource
    private JwtUtil jwtUtil;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ApiOperation("获取列表")
    @GetMapping("/list")
    public Result userList() {
        Result result = new Result();
        ReqLogin reqLogin = new ReqLogin();
        reqLogin.setToken("heyouisbest");
        reqLogin.setPassword("1024");
        reqLogin.setUserName("heyou");
        result.setData(reqLogin);
        result.setSuccess(true);
        result.setMsg("成功");
        return result;
    }

    @ApiOperation("登录")
    @ApiImplicitParam(name = "login", value = "单个用户信息", dataType = "User")
    @PostMapping("login")
    public Result login(@RequestBody ReqLogin userInfo){
        Result result= new Result();
        if(valid(userInfo.getUserName(),userInfo.getPassword())) {
            result.error(CodeEnum.LOGIN_NAMEANDPWD_ERROR.getCode(),CodeEnum.LOGIN_NAMEANDPWD_ERROR.getMsg());
        }
        Map<String,String> map = createUserInfoMap(userInfo.getUserName(),userInfo.getPassword());
        String token = jwtUtil.createToken(map, 1);
        userInfo.setToken(token);
        logger.info(token);
        //存储token
        redisService.setStr(userInfo.getUserName(),token);
        redisService.set("TOKEN",token);
        logger.info(redisService.get(userInfo.getUserName()));

        result.setSuccess(true);
        result.setMsg("登录成功");
        result.setData(userInfo);
        return result;
    }

    /**
     * 验证用户名密码是否合法
     * @param userName
     * @param password
     * @return
     */
    private boolean valid(String userName, String password) {
        return Objects.equal("heyou", userName) && Objects.equal("123456", password);
    }
    private Map<String,String> createUserInfoMap(String userName, String password) {
        Map<String,String> userInfo = new HashMap<>();
        userInfo.put("loginName", userName);
        userInfo.put("password", password);
        return userInfo;
    }
}

