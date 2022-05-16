package com.works;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> names = new HashMap<Integer, String>();
        names.put(1,"Vaishnavi");
        names.put(3,"Hasan");
        names.put(2,"Chithu");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.keySet());
        System.out.println(names.values());
        System.out.println(names.entrySet());
        String newNames = names.remove(2);
        System.out.println(newNames);
        System.out.println(names.entrySet());
    }
}
