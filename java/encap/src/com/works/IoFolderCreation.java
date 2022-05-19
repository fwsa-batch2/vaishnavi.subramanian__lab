package com.works;

import java.io.File;
import java.io.IOException;

public class IoFolderCreation {
    public static void main(String[] args) throws IOException {
        File file = new File("//home//vaishnavisubramanian//NewJavaFolder");
          file.mkdir();
          if (file.createNewFile()){
              System.out.println("New folder created successfully !");
          }else {
              System.out.println("Folder already exists");
          }
    }
}
