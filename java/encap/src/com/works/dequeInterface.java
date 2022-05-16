package com.works;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class dequeInterface {
    public static void main(String[] args) {
        Deque<String> names = new ArrayDeque<>();

        names.add("Vaishu");
        names.add("Meenu");

        System.out.println(names);

        names.addFirst("Sam");
        names.addLast("Noyal");

        System.out.println(names);
        System.out.println(names.contains("Chithu"));
    }
}
