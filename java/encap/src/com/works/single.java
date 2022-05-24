package com.works;

public class single {
    private static single ton;
    private single(){}

    public static single getInstance(){
        if (ton == null){
            ton = new single();
        }
        return ton;
    }
    public void names( String yourName){
        System.out.println(yourName);
    }
}

