package com.works;
import java.lang.*;

public class wrapper {
    public static void main(String[] args) {
        // autoboxing
        int a = 22;
        Integer objA = Integer.valueOf(a);
        Integer objB = a;
        System.out.println("Changing primitive to object : " + objA);
        System.out.println("Changing primitive to object : " + objB);
    
        // unboxing
        Integer objC=10;
        int integer1 = objC.intValue();
        int integer= objB;
        System.out.println("Changing object to primitive : " + integer1);
        System.out.println("Changing object to primitive : " + integer);

        // toString
        Integer number = 100;
        String myString = number.toString();
        System.out.println("Length of number is " + myString.length());
    }
}
