package com.works;

import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> rollNumbers = new PriorityQueue<>();

        rollNumbers.add(84);
        rollNumbers.add(77);
        rollNumbers.add(49);
        rollNumbers.offer(19);

        System.out.println(rollNumbers);              // [19, 49, 77, 84]
        System.out.println(  rollNumbers.poll());     // poll returns null
        System.out.println(rollNumbers);              // [49, 84, 77]

        System.out.println( rollNumbers.remove());    // throws exception
        System.out.println(rollNumbers);              // [49, 84, 77]
    }
}
