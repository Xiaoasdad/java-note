package com.itheima.patterns.mediator;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/22/16:52
 * @ClassName Client
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        HouseMediator mediator = new HouseMediator();
        Person person = new Person("000", Person.TYPE_TENANT, mediator);
        Person person1 = new Person("111", Person.TYPE_HOUSE_OWNER, mediator);
        Person person2 = new Person("22", Person.TYPE_HOUSE_OWNER, mediator);
        Person person3 = new Person("333", Person.TYPE_HOUSE_OWNER, mediator);
        person.sendMsg("Hello World");

    }
}
