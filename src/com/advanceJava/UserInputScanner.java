package com.advanceJava;

import java.util.Scanner;

public class UserInputScanner {
    public static void main(String[] args) {
        String number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextLine();
        System.out.println(number);
    }
}
