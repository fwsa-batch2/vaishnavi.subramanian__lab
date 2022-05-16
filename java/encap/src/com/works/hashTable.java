package com.works;

import java.util.HashMap;
import java.util.Hashtable;

public class hashTable {
    public static void main(String[] args) {
        Hashtable <Integer,String> names = new Hashtable<>();
        names.put(1,"Vaishnavi");
        names.put(3,"Hasan");
        names.put(2,"Chithu");

        System.out.println("HashTable in array : " + names);
        System.out.println("Length of array : " + names.size());
        System.out.println("Keys in array : " + names.keySet());
        System.out.println("Values in array : " + names.values());
        System.out.println("Both keys and values : " + names.entrySet());

        String newNames = names.remove(2);

        System.out.println("Removed entry : " + newNames);
        System.out.println("Entry set : " + names.entrySet());
        System.out.println("Entry set : " + names.entrySet());
    }
}
