package com.gupaoedu.vip.pattern.adapter.loginadapter.v1.service;

import com.gupaoedu.vip.pattern.adapter.loginadapter.ResultMsg;

public class SignForThirdService extends SignService {

    public ResultMsg loginForQQ(String openId){
        return loginForRegist(openId,null);
    }

    public ResultMsg loginForWechat(String openId){
        return loginForRegist(openId,null);
    }


    private ResultMsg loginForRegist(String name, String password) {
        super.regist(name,password);
        return super.loin(name,password);
    }

    @Override
    public ResultMsg regist(String usename, String password) {
        return super.regist(usename, password);
    }
}
