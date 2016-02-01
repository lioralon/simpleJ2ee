package com.zplcod;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by Clancy on 2016/2/1.
 */
public class Car {
    private String brand;
    private String color;
    private String maxSpeed;

    public void introduce() {
        System.out.println("brand:" + this.brand + ";color:" + this.color + ";maxSpeed:" + this.maxSpeed);
    }

    public Car() {
    }

    public Car(String brand, String color, String maxSpeed) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static final Car getCarByReflect() throws Throwable {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class object = loader.loadClass("com.zplcod.Car");
        Constructor cons = object.getDeclaredConstructor((Class[]) null);
        Car car = (Car) cons.newInstance();
        Method setbrand = object.getMethod("setBrand", String.class);
        setbrand.invoke(car, "bmw");
        Method setColor = object.getMethod("setColor", String.class);
        setColor.invoke(car, "white");
        Method setMaxSpeed = object.getMethod("setMaxSpeed", String.class);
        setMaxSpeed.invoke(car, "240");
        return car;
    }
}
