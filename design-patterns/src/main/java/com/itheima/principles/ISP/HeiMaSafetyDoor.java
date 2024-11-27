package com.itheima.principles.ISP;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/10/25/21:46
 * @ClassName HeiMaSafetyDoor
 * @Description
 */
public class HeiMaSafetyDoor implements AntiTheft, FireProof, WaterProof{

    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
