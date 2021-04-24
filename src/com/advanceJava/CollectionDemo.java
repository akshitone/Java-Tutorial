package com.advanceJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        List collection = new ArrayList();
        collection.add(10);
        collection.add(20);
        collection.add(30);
        collection.add(40);
        collection.add(1, 15);

        System.out.println(collection);

        Iterator iterator = collection.iterator();

//        for (int i = 0; i < collection.size(); i++)
//            System.out.println(iterator.next());

//        while (iterator.hasNext())
//            System.out.println(iterator.next());

        for (Object obj : collection)
            System.out.println(obj);
    }
}
