/* Created by Aleksandr 
                       Smirnov
                                */
package lesson20;

import Interfaces.FileCopyFailedException;

public class Main4 {
    public static void main(String[] args) {
        FileCopyWithOneByte files = new FileCopyWithOneByte();
        try {
            files.copyFile("D:\\1.txt", "D:\\2.txt");
        } catch (FileCopyFailedException e) {
            System.out.println(e.getMessage());
        }


    }
}
