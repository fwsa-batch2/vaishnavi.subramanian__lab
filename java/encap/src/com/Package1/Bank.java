package com.Package1;

public class Bank {
    int a = 1;
    public int b=2;
    private int c=3;
    protected int d=4;

    public static void main(String args[]){
        Bank obj1 = new Bank();
        System.out.println("Same class and same package");
        System.out.println("Default - " +obj1.a);
        System.out.println("Public - " + obj1.b);
        System.out.println("Private - " + obj1.c);
        System.out.println("Protected - " + obj1.d);

        Accounts obj2 = new Accounts();
        System.out.println("");
        System.out.println("Same package and subclass");
        System.out.println("Default - " + obj2.a);
        System.out.println("Public - " + obj2.b);
//        System.out.println("Private - " + obj2.c);  // not accessible
        System.out.println("Protected - " + obj2.d);

        Atm obj3 = new Atm();
        System.out.println("");
        System.out.println("Same package and non-subclass");
        System.out.println("Default - " + obj2.a);
        System.out.println("Public - " + obj2.b);
//        System.out.println("Private - " + obj2.c);  // not accessible
        System.out.println("Protected - " + obj2.d);
    }
}

class Accounts extends Bank{

}

class Atm{

}


