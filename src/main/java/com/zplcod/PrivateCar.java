package com.zplcod;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Clancy on 2016/2/2.
 */
public class PrivateCar  {
    private String color;

    protected void call(){
        System.out.println(String.format("private member is :%s%n",this.color) );
    }

    public static final void simulateCall() throws Throwable{
        ClassLoader loader= Thread.currentThread().getContextClassLoader();
        Class<?> clazz = loader.loadClass("com.zplcod.PrivateCar");
        PrivateCar privateCar = (PrivateCar)clazz.newInstance();
        Field field = clazz.getDeclaredField("color");
        field.setAccessible(true);
        field.set(privateCar,"red");

        Method method = clazz.getDeclaredMethod("call",(Class<?>[])null);
        method.setAccessible(true);
        method.invoke(privateCar,(Object[])null);
    }
}
