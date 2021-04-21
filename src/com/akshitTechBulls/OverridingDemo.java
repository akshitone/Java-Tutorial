package com.akshitTechBulls;

class A {
    int sum = 0;

    public int show(int num1, int num2) {
        sum = num1 * num2;
        return num1 * num2;
    }

    public void sumOfNumber() {
        sum = 90;
    }
}

class B extends A {

    @Override // It's just for understanding that you override method of parent class.
    public int show(int num1, int num2) {
        return num1 + num2 + sum;
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        B b = new B();
        b.sumOfNumber();
        int res = b.show(12, 20);
        System.out.println(res);
    }
}
