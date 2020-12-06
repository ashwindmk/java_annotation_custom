package com.ashwin.method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodAnnotationProcessor {
    public static void main(String[] args) {
        System.out.println("Method annotation processing...");

        Class<MyMethodDemo> obj = MyMethodDemo.class;

        for (Method method : obj.getDeclaredMethods()) {
            if (method.isAnnotationPresent(MyMethodAnnotation.class)) {
                MyMethodAnnotation methodAnnotation = method.getAnnotation(MyMethodAnnotation.class);

                if (methodAnnotation.enabled()) {
                    try {
                        String res = (String) method.invoke(obj.getDeclaredConstructor().newInstance());
                        System.out.println("Method " + method.getName() + " is enabled, result: " + res);
                    } catch (IllegalAccessException | InvocationTargetException | InstantiationException | NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Method " + method.getName() + " is disabled");
                }
            }
        }
    }
}
