package com.akshitTechBulls;

class ArgsHandler {
    public float sumOfNumbers(int a, float... numbers) { // Variable length arguments
        float sum = 0;
        sum += a;
        for (float number : numbers) {
            sum += number;
        }
        return sum;
    }
}

public class MultiArgsHandler {
    public static void main(String[] args) {
        ArgsHandler argsHandler = new ArgsHandler();
        float result = argsHandler.sumOfNumbers(5, 10, 20.5f, 5.7f);
        System.out.println("Sum: " + result);
    }
}
