package com.itheima.patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/22/21:33
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("001");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
