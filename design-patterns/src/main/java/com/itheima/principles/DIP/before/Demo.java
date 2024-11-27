package com.itheima.principles.DIP.before;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/10/25/20:15
 * @ClassName Demo
 * @Description 问题：对于Computer类，只能使用特定硬件（即硬件写死在Computer类中），改装则需要改写Computer类
 */
public class Demo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        XiJIeHardDisk hardDisk = new XiJIeHardDisk();
        InterCPU cpu = new InterCPU();
        KingstonMemory memory = new KingstonMemory();

        computer.setHardDisk(hardDisk);
        computer.setCpu(cpu);
        computer.setMemory(memory);

        computer.run();
    }
}
