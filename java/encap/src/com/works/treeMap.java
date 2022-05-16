package com.works;

import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> age = new TreeMap<>();

        age.put("Meenu",20);
        age.put("Vaishu",18);
        age.put("Kasi",19);
        System.out.println("Entry Set : " + age.entrySet());
        System.out.println("Entry Set in descending order : " + age.descendingMap());
        System.out.println("First entry : " + age.firstEntry());
        System.out.println("Last entry : " + age.lastEntry());

        // arranged in ascending order of keys.
    }
}





