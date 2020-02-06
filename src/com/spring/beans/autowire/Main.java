package com.spring.beans.autowire;

import com.spring.beans.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangxin
 * @description 测试
 * @create 2020/2/5
 **/
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-autowired.xml");
        //手动装配
//        Person person = new Person();
//        person =(Person) ctx.getBean("person");
//        System.out.println(person);
        //自动装配
        Person person1 = new Person();
        person1 =(Person) ctx.getBean("person1");

    }
}
