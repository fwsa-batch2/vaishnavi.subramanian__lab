package com.PackageInheritance;

public class Inherit {
    public static void main (String args[]){
        Child obj1 = new Child();
        obj1.outp();
    }
}

class Parent{
    int a = 1;

}

class Child extends Parent{
    int a = 22;

    public void outp(){
        System.out.println("Super class : " + super.a);
        System.out.println("Sub class : " + a);
    }
}