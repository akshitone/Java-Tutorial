package com.akshitTechBulls;

class AdvanceCalc extends Calc {

    AdvanceCalc(float num1, float num2) {
        super(num1, num2);
    }

    public float subtraction() {
        return num1 - num2;
    }
}

class HighAdvCalc extends AdvanceCalc {

    HighAdvCalc(float num1, float num2) {
        super(num1, num2);
    }

    public float multiplication() {
        return num1 * num2;
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
//        AdvanceCalc advanceCalculator = new AdvanceCalc(12.5f, 25.7f);
        HighAdvCalc highAdvCalc = new HighAdvCalc(12.5f, 23.7f);
        System.out.println("Addition: " + highAdvCalc.addition());
        System.out.println("Subtraction: " + highAdvCalc.subtraction());
        System.out.println("Multiplication: " + highAdvCalc.multiplication());
    }
}
