package com.spring.beans.collections;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangxin
 * @description 集合Bean的测试类
 * @create 2020/1/20
 **/
public class CollectionMainTest {
    
    /*
    * @Description:
    * @Author: wx 
    * @Date: 2020/1/20 7:22
    * @Param: 
    * @Return: 
     */
    public static void main(String[] args) throws BeansException {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationConext.xml");
//
//        Person person = new Person();
//        person =(Person) ctx.getBean("person5");
//        System.out.println(person);

        //NewPerson
//        NewPerson newPerson = (NewPerson)  ctx.getBean("newPerson");
//        System.out.println(newPerson);

        //dateSource
//        DataSource dataSource = (DataSource)ctx.getBean("dataSource");
//        System.out.println(dataSource);

//        Person person = new Person();
//        person =(Person) ctx.getBean("person6");
//        System.out.println(person);

        Person person = new Person();
        person =(Person) ctx.getBean("person7");
        System.out.println(person);
    }
}
