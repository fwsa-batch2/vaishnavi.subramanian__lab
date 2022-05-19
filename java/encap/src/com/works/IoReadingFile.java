package com.works;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IoReadingFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("//home//vaishnavisubramanian//NewJavaFolder//NewFile");
        Scanner scan = new Scanner(file);
        while (scan.hasNext()){
            System.out.println(scan.nextLine());
        }
    }
}
