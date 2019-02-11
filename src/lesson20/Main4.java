/* Created by Aleksandr 
                       Smirnov
                                */
package lesson20;

import Interfaces.FileCopyFailedException;

import java.io.File;
import java.io.IOException;

public class Main4 {
    public static void main(String[] args) {
        FileCopyWithOneByte files = new FileCopyWithOneByte();
        try {
            files.copyFile("D:\\1.txt", "D:\\2.txt");
        } catch (FileCopyFailedException e) {
            System.out.println(e.getMessage());
        }

        FileCopyImpl fileCopy = new FileCopyImpl("D:\\New profile\\11.jpg","D:\\New profile\\42.jpg");
        try {
            fileCopy.createChannelsFileCopyUtils();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fileCopy.createBufferedFileCopyUtils();
        } catch (IOException e) {
            e.printStackTrace();
        }


       DirectoryCopy dir = new DirectoryCopy();
        File source = new File("D:\\Intel");
        File destin = new File("D:\\IntelCopy");
        try {
            dir.copyDir(source,destin);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
