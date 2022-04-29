package com.MethodOverloading;

public class Animal {
    public static void main(String args[]){
        Cat obj1 = new Cat();
        obj1.method1(1,"Vaishu");
        obj1.method1(2,"Saaya",987893178);
    }
}

class Cat{
    public void method1(int id, String name){
        System.out.println("Method1 with 2 arguments is executed");
        System.out.println("id : " + id );
        System.out.println( "name : " + name);
    }
    public void method1(int id, String name, int number){
        System.out.println("Method1 with 3 arguments is executed");
        System.out.println("id : " + id );
        System.out.println( "name : " + name);
        System.out.println("number : " + number);
    }
}
