/* Created by Aleksandr 
                       Smirnov
                                */
package lesson20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
    public static void main(String[] args) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\JAVA\\Projects\\Projects.iml"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\JAVA\\Projects\\Projects123.iml"));

            int c = 0;
            while (true) {
                c = bis.read();
                if (c != -1)
                    bos.write(c);
                else
                    break;
            }
            bis.close();
            bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
            bos.close(); //закрываем поток записи (обязательно!)
        } catch (java.io.IOException e) {
            System.out.println(e.toString());
        }
    }

}

