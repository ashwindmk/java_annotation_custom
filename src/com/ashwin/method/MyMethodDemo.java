package com.ashwin.method;

public class MyMethodDemo {
    @MyMethodAnnotation(enabled = true)
    public String methodOne() {
        return "success";
    }

    @MyMethodAnnotation(enabled = false)
    public String methodTwo() {
        return "failure";
    }
}
