package com.Package2;
import com.Package1.*;
public class nonVeg {
    public static void main(String[] args) {
        Bank neo=new Bank();
        System.out.println("Different package with non-sub class");
        System.out.println(neo.b);
    }
}