package com.spring.beans;

/**
 * @author wangxin
 * @create 2020/1/11
 **/
public class HelloWorld {
    private String name;

    public String getName() {
        return name;
    }

    public void setName2(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void hello(){
        System.out.println("hello " + name);
    }
}
