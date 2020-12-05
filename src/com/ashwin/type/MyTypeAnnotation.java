package com.ashwin.type;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)  // Applicable on a class
public @interface MyTypeAnnotation {
    Priority priority() default Priority.MEDIUM;

    String createdBy() default "Ashwin";

    String[] tags() default "";
}
