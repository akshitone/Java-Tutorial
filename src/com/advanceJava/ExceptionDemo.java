package com.advanceJava;

public class ExceptionDemo {
    public static void main(String[] args) {
        int i = 0;
        try {
            int arr[] = null;
            arr[10] = 100;
            i = 9 / 0;
            System.out.println("Is this line run?");
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Bye");
            System.out.println(i);
        }
    }
}
