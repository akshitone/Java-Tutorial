package com.akshitTechBulls;

@FunctionalInterface
interface FunInterface {
    void onlyOneFunction();
}

public class TypesOfInterface {
    public static void main(String[] args) {
        FunInterface funInterface = () -> System.out.println("Single line");
        funInterface.onlyOneFunction();
//        FunInterface abc = new FunInterface() {
//            @Override
//            public void onlyOneFunction() {
//                System.out.println("Anonymous method");
//            }
//        };
//        abc.onlyOneFunction();
    }
}
