package com.itheima.patterns.singleton.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/10/17/15:08
 * @ClassName Client
 * @Description 序列化破坏单例模式，解决：增加readResolve方法
 */
public class Client {
    public static String src = "src/main/java/com/itheima/patterns/singleton/serialization/a.txt";

    public static void main(String[] args) throws Exception {
//        writeObject2File();
        readObjectFromFile();
        readObjectFromFile();
    }

    // 将对象写入文件
    public static void writeObject2File() throws Exception {
        Singleton instance = Singleton.getInstance();
        // 创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(src));
        // 写入对象
        oos.writeObject(instance);
        oos.close();
    }

    public static void readObjectFromFile() throws Exception {
        // 创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(src));
        // 读取对象
        Singleton instance = (Singleton) ois.readObject();

        System.out.println(instance);
        ois.close();
    }
}
