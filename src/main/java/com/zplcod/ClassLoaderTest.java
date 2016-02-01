package com.zplcod;

/**
 * Created by Clancy on 2016/2/1.
 */
public class ClassLoaderTest {
    public static final String getLoadOrder(){
        ClassLoader loader=Thread.currentThread().getContextClassLoader();
        StringBuilder sb  = new StringBuilder();
        sb.append(String.format("current loader:%s%n",loader));
        sb.append(String.format("parent loader:%s%n",loader.getParent()));
        sb.append(String.format("grand parent loader:%s%n",loader.getParent().getParent()));
        return  sb.toString();
    }
}
