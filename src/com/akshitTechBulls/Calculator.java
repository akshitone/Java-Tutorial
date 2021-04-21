package com.akshitTechBulls;

class Calc {
    float num1, num2;

    Calc(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float addition() {
        return num1 + num2;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Calc obj = new Calc(12, 25);
        System.out.println(obj.addition());

    }
}
