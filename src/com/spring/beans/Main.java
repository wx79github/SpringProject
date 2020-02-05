package com.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangxin
 * @description 测试 Bean
 * @create 2020/1/11
 **/
public class Main {
    
    public static void main(String[] args) throws BeansException {

        //1.创建ioc容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationConext.xml");
//      HelloWorld
        //2.从IOC容器中获取bean对象
        // 利用id定位到ioc容器的bean
//        HelloWorld hellodWorld = (HelloWorld) ctx.getBean("helloWorld");
        // 利用类型返回容器中的bean，要求ioc中只有一个该类型的Bean
//        HelloWorld helloWorld1 = ctx.getBean(HelloWorld.class);
//        helloWorld1.hello();
        //3.调用hellworld方法
//        hellodWorld.hello();
//      Car
//        Car car  = (Car) ctx.getBean("car2");
//        System.out.println(car);

//        Peron
//        Person person = new Person();
//        person =(Person) ctx.getBean("person");
//        System.out.println(person);

        Person person = new Person();
        person =(Person) ctx.getBean("person4");
        System.out.println(person);



    }
}
