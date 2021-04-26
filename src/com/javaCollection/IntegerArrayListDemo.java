package com.javaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerArrayListDemo {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(30);
        list.add(10);
        list.add(20);
        Collections.sort(list);
//        Collections.reverse(list);
        for (Integer value : list)
            System.out.println(value);
    }
}
