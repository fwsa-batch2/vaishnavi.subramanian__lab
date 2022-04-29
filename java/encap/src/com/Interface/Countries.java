package com.Interface;


import static com.Interface.inter.a;

interface inter{
    final int a = 12;
    void popular();
}
class America implements inter{
    public void popular(){
        System.out.println("Statue of liberty is popular in America");
    }
}

public class Countries {
    public static void main(String args[]){
        America obj1 = new America();
        obj1.popular();
        System.out.println("Final : " + a);
    }
}