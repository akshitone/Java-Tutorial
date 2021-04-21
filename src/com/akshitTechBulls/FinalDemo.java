package com.akshitTechBulls;

final class AF { // No one class can extend your class
    final Number PI = 3.14; // constant

    public void show() {
        System.out.println("I'm in AF Class.");
    }
}

class BF {
    public final void show() { // No one class can override your method
        System.out.println("I'm in BF Class.");
    }
}

class CF extends BF {
    public void showMustGoOn() {
        System.out.println("I'm in CF Class.");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        AF af = new AF();
        System.out.println(af.PI);
        System.out.println(af.PI.getClass().getName());
    }
}
