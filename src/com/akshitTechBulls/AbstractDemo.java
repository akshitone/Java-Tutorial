package com.akshitTechBulls;

// You can not create object of abstract class
// If you have abstract method in your class. Class must be abstract too.
abstract class Human {
    public abstract void eat();

    public void walk() {
        System.out.println("I'm Human.");
    }
}

class Man extends Human {
    @Override
    public void eat() {

    }
}

abstract class Writer {
    public abstract void write();
}

class Pen extends Writer {
    @Override
    public void write() {
        System.out.println("Write using pen.");
    }
}

class Pencil extends Writer {
    @Override
    public void write() {
        System.out.println("Write using pencil.");
    }
}

class Tool{
    public void writing(Writer writer){
        writer.write();
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Human human = new Man();
        human.walk();
        Writer pen = new Pen();
        Writer pencil = new Pencil();
        Tool tool = new Tool();
        tool.writing(pen);
    }
}
