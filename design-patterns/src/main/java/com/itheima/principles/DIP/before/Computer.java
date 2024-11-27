package com.itheima.principles.DIP.before;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/10/25/20:12
 * @ClassName Computer
 * @Description
 */
public class Computer {

    private XiJIeHardDisk hardDisk;
    private InterCPU cpu;
    private KingstonMemory memory;

    public XiJIeHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(XiJIeHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public InterCPU getCpu() {
        return cpu;
    }

    public void setCpu(InterCPU cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
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
