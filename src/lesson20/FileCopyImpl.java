/*
Created by Aleksandr
                    Smirnov*/
package lesson20;

import Interfaces.FileCopyTestUtils;
import Interfaces.FileCopyUtils;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopyImpl implements FileCopyTestUtils {
    private String source;
    private String destination;

    public FileCopyImpl(){}

    public FileCopyImpl(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }


    public String getDestination() {
        return destination;
    }


    @Override
    public FileCopyUtils createSimpleFileCopyUtils() {
        try {
            FileInputStream sour = new FileInputStream(source);
            FileOutputStream dest = new FileOutputStream(destination);
            byte[] buffer = new byte[sour.available()];
            sour.read(buffer, 0, buffer.length);
            dest.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public FileCopyUtils createBufferedFileCopyUtils() throws IOException {
        try {
            BufferedInputStream sourceBuf = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream destinationBuf = new BufferedOutputStream(new FileOutputStream(destination));
            int c = 0;
            while (true) {
                c = sourceBuf.read();
                if (c != -1)
                    destinationBuf.write(c);
                else
                    break;
            }
            sourceBuf.close();
            destinationBuf.flush();
            destinationBuf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public FileCopyUtils createChannelsFileCopyUtils() throws IOException {
        FileChannel sourceChannel = null;
        FileChannel destinationChannel = null;
        try {
            sourceChannel = new FileInputStream(source).getChannel();
            destinationChannel = new FileOutputStream(destination).getChannel();
            destinationChannel.transferFrom(sourceChannel, 0, sourceChannel.size());

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } finally {
            sourceChannel.close();
            destinationChannel.close();
        }

        return null;
    }

    @Override
    public FileCopyUtils createJava7CopyUtils() {
        Path sour = Paths.get(getSource());
        Path dest = Paths.get(getDestination());
        try {
            Files.copy(sour, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
