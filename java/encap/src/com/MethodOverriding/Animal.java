package com.MethodOverriding;

public class Animal{
    public static void main(String args[]){
        Cat obj2 = new Cat();
        obj2.main();
        obj2.food();
    }
}
class Dog{
    public void food(){
        System.out.println("Super class :");
        System.out.println("Dog eats biscuits");
    }
}

class Cat extends Dog{
    public void food(){
        System.out.println("Sub class :");
        System.out.println("Cat drinks milk");
    }
    public void main(){
        Cat obj1 = new Cat();
        super.food();

    }
}
