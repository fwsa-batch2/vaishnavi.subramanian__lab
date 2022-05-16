package com.works;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class blockingDeque {
    public static void main(String[] args) {
        BlockingDeque<String> colors = new LinkedBlockingDeque<>();

        colors.add("Pink");
        colors.add("blue");

        System.out.println(colors);
    }
}
