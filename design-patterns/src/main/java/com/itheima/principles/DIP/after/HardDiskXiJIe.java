package com.itheima.principles.DIP.after;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/10/25/20:07
 * @ClassName HiJieHardDisk
 * @Description
 */
public class HardDiskXiJIe implements HardDisk {
    public void save(String data) {
        System.out.println("希捷硬盘存储数据" + data);
    }

    public String getData() {
        System.out.println("希捷硬盘读取数据");
        return "数据";
    }
}
