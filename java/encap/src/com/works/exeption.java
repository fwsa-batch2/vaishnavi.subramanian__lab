package com.works;

public class exeption extends Throwable {
    public static void main(String[] args) {
        try {
            int a = 33/0;
            System.out.println("Wrong !!!!");
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("There is an error");
        }
        finally {
            System.out.println("Finally is executed !");
        }
    }
}
