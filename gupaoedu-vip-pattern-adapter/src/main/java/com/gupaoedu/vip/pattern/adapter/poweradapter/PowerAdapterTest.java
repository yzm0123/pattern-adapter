package com.gupaoedu.vip.pattern.adapter.poweradapter;

public class PowerAdapterTest {
    public static void main(String[] args) {
        AC220 ac220 = new AC220();
        PowerAdapter powerAdapter = new PowerAdapter(ac220);
        powerAdapter.outputDC5v();
    }
}
