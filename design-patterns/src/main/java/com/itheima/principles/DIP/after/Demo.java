package com.itheima.principles.DIP.after;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/10/25/20:15
 * @ClassName Demo
 * @Description 改装只需更改main中的配件，无需更改Computer类
 */
public class Demo {
    public static void main(String[] args) {
        // 获取电脑对象
        Computer computer = new Computer();

        // 获取硬件对象
        HardDisk hardDisk = new HardDiskXiJIe();
        Cpu cpu = new CpuInter();
        Memory memory = new MemoryKingston();


        computer.setHardDisk(hardDisk);
        computer.setCpu(cpu);
        computer.setMemory(memory);

        computer.run();
    }
}
