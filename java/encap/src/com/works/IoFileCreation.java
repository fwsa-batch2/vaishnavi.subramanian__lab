package com.works;

import java.io.File;
import java.io.IOException;

public class IoFileCreation {
    public static void main(String[] args) throws IOException {
        File file = new File("//home//vaishnavisubramanian//NewJavaFolder//NewFile");
        if (file.createNewFile()){
            System.out.println("New file created successfully !");
        }else {
            System.out.println("File already exists");
        }
    }
}
