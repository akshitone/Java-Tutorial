package com.akshitTechBulls;

@FunctionalInterface
interface InterDemo {
    void show();

    default void display() {
        System.out.println("I'm in interface display method.");
    }
}

class InterImplement implements InterDemo{
    @Override
    public void show() {
        System.out.println("From inter implement.");
        InterDemo.super.display();
    }

    @Override
    public void display() {
        System.out.println("from InterImplement class.");
    }
}

public class InterfaceDemo2 {
    public static void main(String[] args) {
        InterImplement interImplement = new InterImplement();
        interImplement.show();
        interImplement.display();

        InterDemo interDemo = () -> System.out.println("Interface anonymous method.");
    }
}
