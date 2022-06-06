package com.works;

import java.util.Scanner;

public class doop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names = sc.next();
        char[] characters = names.toCharArray();
        boolean[] bool = new boolean[256];
        StringBuilder builder = new StringBuilder();
        for (char c : characters) {
           if (!bool[c]) {
              bool[c] = true;
              builder.append(c);
           }
        }
        System.out.println(builder.toString());
    }
}
