/* Created by Aleksandr 
                       Smirnov
                                */
package lesson23;

import Interfaces2.FindFilesTask;
import Interfaces2.TaskExecutionFailedException;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FindFileTaskImpl extends TaskImpl implements FindFilesTask {

    private String directory;
    private String searchString;
    private PrintStream out;

    FindFileTaskImpl() {
    }

    public FindFileTaskImpl(String directory, String searchString, PrintStream out) {
        this.directory = directory;
        this.searchString = searchString;
        this.out = out;
    }

    @Override
    public void setDirectory(String directory) throws NullPointerException, FileNotFoundException {
        this.directory = directory;
    }

    @Override
    public void setFileNameSearchString(String searchString) throws IllegalArgumentException {
        this.searchString = searchString;
    }

    @Override
    public void setPrintStream(PrintStream out) {
        this.out = out;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        File directoryFrom = new File(directory);
        if (!directoryFrom.exists())
            throw new TaskExecutionFailedException("No Directory in Path!");

        if (directoryFrom.isFile())
            throw new TaskExecutionFailedException("This is not a Directory!");

        File[] files = directoryFrom.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().contains(searchString);
            }
        });
        if (files.length == 0)
            out.print("No find files in this directory");

        for (File file : files) {
            out.println(file.getAbsoluteFile());
        }
    }

    @Override
    public String toString() {
        return "FindFileTaskImpl{" +
                "directory='" + directory + '\'' +
                ", searchString='" + searchString + '\'' +
                ", out=" + out +
                '}';
    }
}
