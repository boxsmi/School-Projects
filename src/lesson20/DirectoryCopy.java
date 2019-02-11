/*
Created by Aleksandr
                    Smirnov*/
package lesson20;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class DirectoryCopy {

    public void copyDir(File src, File dest) throws IOException {

        if (src.isDirectory()) {

            //if directory not exists, create it
            if (!dest.exists()) {
                dest.mkdir();
            }

            //list all the directory contents
            String files[] = src.list();

            for (String file : files) {
                //construct the src and dest file structure
                File srcFile = new File(src, file);
                File destFile = new File(dest, file);
                //recursive copy
                copyDir(srcFile, destFile);
            }

        } else {
            //if file, then copy it

            Path source = Paths.get(src.getAbsolutePath());
            Path destination = Paths.get(dest.getAbsolutePath());
            Files.copy(source, destination);
            System.out.println("File copied from " + src + " to " + dest);

        }
    }
}
