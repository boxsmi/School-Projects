/*
Created by Aleksandr
                    Smirnov*/
package lesson20;

import Interfaces.FileAlreadyExistsException;
import Interfaces.FileCopyFailedException;
import Interfaces.FileCopyUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyWithStandartUtils implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException, IOException {
        File destinationFile = new File(destination);
        if (destinationFile.exists()) throw new FileAlreadyExistsException("File Already Exists");
        try {
            FileInputStream sour = new FileInputStream(source);
            FileOutputStream dest = new FileOutputStream(destination);
            byte[] buffer = new byte[sour.available()];
            sour.read(buffer, 0, buffer.length);
            dest.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            throw new FileCopyFailedException(e.getMessage());
        }
    }
}
