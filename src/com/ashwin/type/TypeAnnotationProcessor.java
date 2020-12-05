package com.ashwin.type;

import java.util.Arrays;

public class TypeAnnotationProcessor {
    public static void main(String[] args) {
        System.out.println("Type annotation processing...");

        Class<MyTypeDemo> obj = MyTypeDemo.class;

        if (obj.isAnnotationPresent(MyTypeAnnotation.class)) {
            MyTypeAnnotation myTypeAnnotation = obj.getAnnotation(MyTypeAnnotation.class);

            System.out.println("Priority: " + myTypeAnnotation.priority());
            System.out.println("Created By: " + myTypeAnnotation.createdBy());
            System.out.println("Tags: " + Arrays.toString(myTypeAnnotation.tags()));
        }
    }
}
