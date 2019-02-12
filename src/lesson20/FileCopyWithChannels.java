/*
Created by Aleksandr
                    Smirnov*/
package lesson20;

import Interfaces.FileAlreadyExistsException;
import Interfaces.FileCopyFailedException;
import Interfaces.FileCopyUtils;

import java.io.*;
import java.nio.channels.FileChannel;

public class FileCopyWithChannels implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException, IOException {
        File destinationFile = new File(destination);
        if (destinationFile.exists()) throw new FileAlreadyExistsException("File Already Exists");
        FileChannel sourceChannel = null;
        FileChannel destinationChannel = null;
        try {
            sourceChannel = new FileInputStream(source).getChannel();
            destinationChannel = new FileOutputStream(destination).getChannel();
            destinationChannel.transferFrom(sourceChannel, 0, sourceChannel.size());

        } catch (IOException e) {
            e.printStackTrace();
            throw new FileCopyFailedException(e.getMessage());

        } finally {
            sourceChannel.close();
            destinationChannel.close();
        }
    }
}
