package com.advanceJava;

public class UserDefineException {
    public static void main(String[] args) {
        int i, j;
        i = 10;
        j = 20;
        try {
            int res = i / j;
            if (res == 0)
                throw new ZeroException("It's value zero.");
        } catch (ZeroException e) {
            System.err.println("Message: " + e.getMessage());
        }

    }
}
