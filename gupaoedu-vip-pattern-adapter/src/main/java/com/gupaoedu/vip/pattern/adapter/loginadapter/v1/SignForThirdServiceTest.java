package com.gupaoedu.vip.pattern.adapter.loginadapter.v1;

import com.gupaoedu.vip.pattern.adapter.loginadapter.ResultMsg;
import com.gupaoedu.vip.pattern.adapter.loginadapter.v1.service.SignForThirdService;

public class SignForThirdServiceTest {

    public static void main(String[] args) {
        SignForThirdService service = new SignForThirdService();
        ResultMsg resultMsg = service.loginForQQ("308541846");
        service.loin("Tom","11233");

    }
}
