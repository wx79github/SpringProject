package com.spring.beans.autowire;

/**
 * @author wangxin
 * @description 汽车类
 * @create 2020/1/19
 **/
public class Car {
    private String brand;
    private String price;



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
