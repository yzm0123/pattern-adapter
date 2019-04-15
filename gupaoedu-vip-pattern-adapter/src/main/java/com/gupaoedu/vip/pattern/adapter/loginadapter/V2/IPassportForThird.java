package com.gupaoedu.vip.pattern.adapter.loginadapter.V2;

import com.gupaoedu.vip.pattern.adapter.loginadapter.ResultMsg;

/**
 * 只扩展
 */
public interface IPassportForThird {

    ResultMsg loginForQQ(String qq);

    ResultMsg loginForWechat(String wechat);


}
