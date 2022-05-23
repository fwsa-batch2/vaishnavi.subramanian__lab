package com.works;

public class ThreadClass extends Thread{

    public void run(){
        System.out.println("Hii.. I am thread");
    }
    public static void main(String[] args) {
        ThreadClass a = new ThreadClass();
        System.out.println("Starts");
        a.start();
        System.out.println("Ends");
    }
}
