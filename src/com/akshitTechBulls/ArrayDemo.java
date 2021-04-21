package com.akshitTechBulls;

public class ArrayDemo {
    public static void main(String[] args) {
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = i + 2 * 2;
            }
        }

        // first way
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // second way
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        int arr2[][] = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9, 10}
        };

        // first way
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        // second way
        for (int i[] : arr2) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
