package com.gupaoedu.vip.pattern.adapter.loginadapter.v1.service;

import com.gupaoedu.vip.pattern.adapter.loginadapter.ResultMsg;
import com.gupaoedu.vip.pattern.adapter.loginadapter.Member;

public class SignService {

    /**
     * 注册
     * @param usename
     * @param password
     * @return
     */
    public ResultMsg regist(String usename, String password){

        return new ResultMsg(200,"注册成功",new Member());
    }

    /**
     * 登录
     * @param usename
     * @param password
     * @return
     */
    public ResultMsg loin(String usename, String password){
        return new ResultMsg(200,"登录成功",new Member());
    }
}
