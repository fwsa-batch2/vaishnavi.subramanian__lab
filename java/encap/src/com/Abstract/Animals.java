package com.Abstract;

public class Animals {
   public static void main(String args[]){
       Mouse obj1 = new Mouse();
       obj1.eat();
       obj1.sleep();
       obj1.work();

       Rabbit obj2 = new Rabbit();
       obj2.all();

   }
}

abstract class Animal{
    abstract void eat();
    abstract void sleep();
}
class Mouse extends Animal {
    void eat(){
        System.out.println("Mouse eats cheese");
    }
    void sleep(){
        System.out.println("Mouse sleeps for 4 hours");
    }
    void work(){
        System.out.println("Mouse works for 1 hour");
    }
}
class Rabbit extends Animal{
    void eat(){
        System.out.println("Rabbit eats carrot");
    }
    void sleep(){
        System.out.println("Rabbit sleeps for 12 hours");
    }
    void all(){
        eat();
        sleep();

    }
}