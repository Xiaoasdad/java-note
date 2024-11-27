package com.itheima.principles.DIP.after;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/10/25/20:12
 * @ClassName Computer
 * @Description
 */
public class Computer {

    private HardDisk hardDisk;
    private Cpu cpu;
    private Memory memory;

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void run() {
        System.out.println("运行计算机");
        String data = hardDisk.getData();
        System.out.println("获取数据" + data);
        cpu.run();
        memory.save();
    }
}
