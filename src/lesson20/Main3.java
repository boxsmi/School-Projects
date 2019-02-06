/* Created by Aleksandr 
                       Smirnov
                                */
package lesson20;

import java.io.File;
import java.io.FileFilter;

public class Main3 {
    public static void main(String[] args) {
        File diskC = new File("C:\\");
        System.out.println(diskC.isDirectory());
//        System.out.println(diskC.toString());
//        System.out.println(diskC.exists());
//        if(!diskC.exists())
//            diskC.mkdir();
//            diskC.delete();
        File[] files = diskC.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getAbsolutePath().endsWith(".log");
            }
        });
        for(File f:files){
            System.out.println(f.getAbsoluteFile());
        }
    }
}
