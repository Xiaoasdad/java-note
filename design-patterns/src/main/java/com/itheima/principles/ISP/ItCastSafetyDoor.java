package com.itheima.principles.ISP;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/10/25/21:50
 * @ClassName ItCastSafetyDoor
 * @Description
 */
public class ItCastSafetyDoor implements AntiTheft,FireProof{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }
}
