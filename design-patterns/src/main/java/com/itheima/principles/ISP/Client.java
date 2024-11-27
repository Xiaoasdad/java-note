package com.itheima.principles.ISP;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/10/25/21:47
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        HeiMaSafetyDoor heiMaSafetyDoor = new HeiMaSafetyDoor();
        // 调用功能
        heiMaSafetyDoor.antiTheft();
        heiMaSafetyDoor.fireProof();
        heiMaSafetyDoor.waterProof();

        System.out.println("=====================");

        ItCastSafetyDoor itCastSafetyDoor = new ItCastSafetyDoor();
        itCastSafetyDoor.antiTheft();
        itCastSafetyDoor.fireProof();
    }
}
