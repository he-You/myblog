package com.heyou.myblog.util;

/**
 * @author heyou
 * @date 2019-11-20 09:59
 */
public class TokenUtil {
    /**
     *进行数字签名的私钥
     */
    private static final String APP_KEY = "HeYou_SpringBoot";
    /**
     * token过期时间7天
     */
    private final static long KEEP_TIME = 7 * 24 * 60 * 60 * 1000;

    private final static String PLATEFORM ="heyou";

    private TokenUtil(){

    }


}
