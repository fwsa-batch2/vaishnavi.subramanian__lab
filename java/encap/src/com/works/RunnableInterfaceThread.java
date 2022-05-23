package com.works;

public class RunnableInterfaceThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Method is Running");
    }

    public static void main(String[] args) {
        Thread a = new Thread(new RunnableInterfaceThread());
        System.out.println("Started");
        a.start();
        System.out.println("Ended");
    }
}
