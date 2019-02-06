/* Created by Aleksandr 
                       Smirnov
                                */
package lesson20;

import Interfaces.FileAlreadyExistsException;
import Interfaces.FileCopyFailedException;
import Interfaces.FileCopyUtils;

import java.io.*;

public class FileCopyWithOneByte implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        File destinationFile = new File(destination);
        if (destinationFile.exists()) throw new FileAlreadyExistsException("File Already Exists");
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination));

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
            throw new FileCopyFailedException(e.getMessage());
        }
    }
}
