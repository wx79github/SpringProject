package com.spring.beans;

/**
 * @author wangxin
 * @description 汽油类
 * @create 2020/1/19
 **/
public class Car {
    private String brand;
    private String corp;
    private String price;
    private String maxSend;
    private int amount;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCorp() {
        return corp;
    }

    public void setCorp(String corp) {
        this.corp = corp;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMaxSend() {
        return maxSend;
    }

    public void setMaxSend(String maxSend) {
        this.maxSend = maxSend;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Car(String brand, String corp, String price) {
        this.brand = brand;
        this.corp = corp;
        this.price = price;
    }

    public Car(String brand, String corp, int amount) {
        this.brand = brand;
        this.corp = corp;
        this.amount = amount;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", corp='" + corp + '\'' +
                ", price='" + price + '\'' +
                ", maxSend='" + maxSend + '\'' +
                ", amount=" + amount +
                '}';
    }
}
