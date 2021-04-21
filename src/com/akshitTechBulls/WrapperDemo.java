package com.akshitTechBulls;

public class WrapperDemo {
    public static void main(String[] args) {
        int a = 10; // primitive data type
        Integer b = new Integer(a); // boxing - wrapping
        int c = b.intValue(); // unboxing - unwrapping
        Integer d = a; // auto-boxing
        int e = d; // auto-unboxing

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        String str = "123";
        int num = Integer.parseInt(str);

        System.out.println(num);
    }
}
