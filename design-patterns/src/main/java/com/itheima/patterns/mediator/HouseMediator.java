package com.itheima.patterns.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/22/16:05
 * @ClassName HouseMediator
 * @Description
 */
public class HouseMediator extends Mediator{

    private List<Person> personList = new ArrayList<>();

    public void register(Person person) {
        personList.add(person);
    }

    @Override
    public void contact(String msg, Colleague person) {
        for (Person person1 : personList) {
            if (!Objects.equals(person.getType(), person1.getType())) {
                person1.receiveMsg(msg);
            }
        }
    }
}
