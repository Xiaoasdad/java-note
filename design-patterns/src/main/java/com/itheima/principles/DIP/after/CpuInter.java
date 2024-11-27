package com.itheima.principles.DIP.after;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/10/25/20:10
 * @ClassName CPU
 * @Description
 */
public class CpuInter implements Cpu {
    public void run() {
        System.out.println("使用英特尔CPU");
    }
}
