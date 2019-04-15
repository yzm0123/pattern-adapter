package com.gupaoedu.vip.pattern.adapter.poweradapter;

public class PowerAdapter implements DC5 {

    private AC220 ac220 ;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5v() {
        int adapterInput = ac220.outputAC22O();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用PowerAdapter输入电压为：" + adapterInput + "V,输出电压： " + adapterOutput + "V");
        return adapterOutput;
    }
}
