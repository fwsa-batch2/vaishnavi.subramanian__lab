package com.works;

import java.util.LinkedHashMap;

public class linkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap <String,Integer> markList = new LinkedHashMap<>();

        markList.put("Meenu",100);
        markList.put("Chithu",47);
        markList.put("Ismail",45);
        markList.put("Sangeetha",67);
        markList.put("Annapoorni",90);
        markList.put(null,0);
        markList.put(null,44);
        System.out.println("Entry Set : " + markList.entrySet());

       // only one null key is allowed
       // multiple null value is allowed

        markList.clear();
        System.out.println(markList.entrySet());

    }
}
