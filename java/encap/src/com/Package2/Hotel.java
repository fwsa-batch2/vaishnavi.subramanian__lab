package com.Package2;
import com.Package1.*;

public class Hotel {
    public static void main(String args[]){
        Bill obj4 = new Bill();
        System.out.println("");
        System.out.println("Different package and subclass");
//        System.out.println("Default - " + obj4.a);
        System.out.println("Public - " + obj4.b);
//        System.out.println("Private - " + obj2.c);  // not accessible
//        System.out.println("Protected - " + obj4.d);

        Veg obj5 = new Veg();
        Bank klm=new Bank();
        System.out.println("");
        System.out.println("Different package and subclass");
//        System.out.println("Default - " + obj5.a);
        System.out.println("Public - " + klm.b);
//        System.out.println("Private - " + obj2.c);  // not accessible
//        System.out.println("Protected - " + obj5.d);

    }


static class Bill extends Bank{

}

static class Veg extends Hotel{


}


}

