package com.advanceJava;

import com.advanceJava.Test.StudentDemo;

public class AccessModifierDemo {
    public static void main(String[] args) {
        StudentDemo studentDemo = new StudentDemo();
        studentDemo.rollNo = 123;
        studentDemo.setName("Johnson");
//        studentDemo.marks = 23;
        System.out.println(studentDemo.getName());
    }
}
