package com.gupaoedu.vip.pattern.adapter.loginadapter.V2;

import com.gupaoedu.vip.pattern.adapter.loginadapter.ResultMsg;
import com.gupaoedu.vip.pattern.adapter.loginadapter.V2.adapters.LoginAdapter;
import com.gupaoedu.vip.pattern.adapter.loginadapter.V2.adapters.LoginForQQAdapter;
import com.gupaoedu.vip.pattern.adapter.loginadapter.V2.adapters.LoginForWechatAdapter;
import com.gupaoedu.vip.pattern.adapter.loginadapter.v1.service.SignService;

public class PassportForThirdAdapter extends SignService implements IPassportForThird {


    @Override
    public ResultMsg loginForQQ(String qq) {
        //适配器不一定要实现接口
//        LoginForQQAdapter qqAdapter = new LoginForQQAdapter();
//        if(qqAdapter.support(qqAdapter)){
//            return qqAdapter.login(qq,qqAdapter);
//        }
//        return null;

        return processLogin(qq, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String wechat) {
//        LoginForWechatAdapter wechatAdapter = new LoginForWechatAdapter();
//        if(wechatAdapter.support(wechatAdapter)){
//            return wechatAdapter.login(wechat,wechatAdapter);
//
//        }
//        return null;
        return processLogin(wechat,LoginForWechatAdapter.class);
    }

    private ResultMsg processLogin(String key , Class<? extends LoginAdapter> clazz){
        try {
            LoginAdapter adapter = clazz.newInstance();
            if(adapter.support(adapter)){
                return adapter.login(key,adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
