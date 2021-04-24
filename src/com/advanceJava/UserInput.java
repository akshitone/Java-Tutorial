package com.advanceJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput {
    public static void main(String[] args) throws Exception {
        int n = 0;
        BufferedReader bufferedReader = null;
        System.out.println("Enter number: ");
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(bufferedReader.readLine());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            bufferedReader.close();
        }
        System.out.println(n);
    }
}
