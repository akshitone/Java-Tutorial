package com.akshitTechBulls;

class Check {
    Check() {
        System.out.println("Hello I'm default");
    }

    Check(int a) {
        System.out.println("Hello I'm default with arguments");
    }
}

public class Pattern01 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        Check obj = new Check();
    }
}
