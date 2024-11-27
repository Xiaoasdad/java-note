package com.itheima.patterns.mediator;

/**
 * @Author L7WD3-Xiao
 * @Date 2024/11/22/16:39
 * @ClassName Person
 * @Description
 */
public class Person extends Colleague{

    public static final String TYPE_HOUSE_OWNER = "屋主";
    public static final String TYPE_TENANT = "租客";


    public Person(String name, String type, Mediator mediator) {
        super(name, type, mediator);
        mediator.register(this);
    }
}
