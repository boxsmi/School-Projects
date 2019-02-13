/*
Created by Aleksandr
                    Smirnov*/
package lesson20;

import Interfaces.IOUtils;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class IOUtilsImpl implements IOUtils {
    @Override
    public void replaceChars(Reader in, Writer out, String inChars, String outChars) throws NullPointerException, IllegalArgumentException {
        try {
            while (true) {
                char ch = (char) in.read();
                int index = inChars.indexOf(ch);
                if (index != -1) {
                    ch = outChars.charAt(index);
                }
                out.write(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Функция находит все файлы в директории и поддиректориях и возвращает их полные пути в виде массива строк.
     *
     * @param dir папка с которой необходимо начать поиск
     * @return массив путей к файлам
     * @throws NullPointerException     если dir == null
     * @throws IllegalArgumentException если dir не существует
     */
    @Override
    public String[] findFiles(String dir) throws NullPointerException, IllegalArgumentException {
        if (dir == null) {
            System.err.println("Папки это NULL!");
            throw new NullPointerException();
        }
        File dirOfFiles = new File(dir);
        if (!dirOfFiles.exists()) {
            System.err.println("Папки не существует!");
            throw new IllegalArgumentException();
        }
        File[] listOfFiles = dirOfFiles.listFiles();

        for (File list : listOfFiles) {
            if (list.isDirectory())
                findFiles(list.getAbsolutePath());
            System.out.println(list.getAbsolutePath());
        }
        return dirOfFiles.list();
    }
}


