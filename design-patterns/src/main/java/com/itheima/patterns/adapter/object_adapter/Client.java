package com.itheima.patterns.adapter.object_adapter;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/11/0:00
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();

        Tf2SdAdapter adapter = new Tf2SdAdapter(new TfCardImpl());
        String msg =  computer.readSd(adapter);
        System.out.println(msg);


    }
}
