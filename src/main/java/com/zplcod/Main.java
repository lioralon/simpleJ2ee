package com.zplcod;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Throwable {

        Car car = Car.getCarByReflect();
        System.out.println(ClassLoaderTest.getLoadOrder());
        System.out.println("hello");
    }
}
