package com.works;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class blockingQueueInter {
    public static void main(String[] args) {
        BlockingQueue<String> cities = new ArrayBlockingQueue<>(3);
        cities.add("Coimbatore");
        cities.add("Chennai");
        cities.add("Trichy");

        System.out.println(cities);

    }
}
