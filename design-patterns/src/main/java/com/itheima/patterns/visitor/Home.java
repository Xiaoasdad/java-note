package com.itheima.patterns.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/22/22:36
 * @ClassName Home
 * @Description 对象结构类，存储一组元素对象
 */
public class Home {

    List<Pet> pets = new ArrayList<>();

    public void add(Pet pet) {
        pets.add(pet);
    }

    public void interact(Person person) {
        for (Pet pet : pets) {
            pet.accept(person);
//            由于静态分派的原因，不能直接调用
//            person.feed(pet);
        }
    }
}
