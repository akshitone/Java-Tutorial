package com.akshitTechBulls;

class Outer {
    int a;

    public void outerDisplay() {
        System.out.println("Outer display");
    }

    //    Outer$Inner.class
    //    if you create static class you don't need to object here
    static class Inner {
        int b;

        public void innerDisplay() {
            System.out.println("Inner display");
        }
    }
}

public class InnerDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
//        Outer.Inner inner = outer.new Inner(); if it's default class.
        Outer.Inner inner = new Outer.Inner();
        outer.outerDisplay();
        inner.innerDisplay();
    }
}
