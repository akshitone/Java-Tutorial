package com.akshitTechBulls;

interface InterOne {
    int number = 10; // by default variable in interface is final / constant

    void show();

    default void display() {
        System.out.println("I'm in interface 01 display method.");
    }

    static void staticMethod() {
        System.out.println("Without object you can call.");
    }
}

interface InterTwo {
    default void display() {
        System.out.println("I'm in interface 02 display method.");
    }
}

class InterInheritanceImplement implements InterOne, InterTwo {
    @Override
    public void show() {
        System.out.println("I'm in class.");
    }

    @Override
    public void display() {
        InterOne.super.display();
        InterTwo.super.display();
    }
}

public class InterfaceWithInheritance {
    public static void main(String[] args) {
        InterInheritanceImplement interInheritanceImplement = new InterInheritanceImplement();
        interInheritanceImplement.show();
        interInheritanceImplement.display();
        InterOne.staticMethod();
    }
}
