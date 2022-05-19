package com.works;

import java.io.FileWriter;
import java.io.IOException;

public class IoWritingFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("//home//vaishnavisubramanian//NewJavaFolder//NewFile");
        writer.append("Hello world !!");
        writer.append("Welcome to Java");
        writer.close();
        System.out.println("Written successfully");
    }
}
