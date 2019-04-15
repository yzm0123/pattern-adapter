package com.gupaoedu.vip.pattern.adapter.loginadapter.V2.adapters;

import com.gupaoedu.vip.pattern.adapter.loginadapter.ResultMsg;

public interface LoginAdapter {

    boolean support(Object adapter);

    ResultMsg login(String id,Object adapter);
}
