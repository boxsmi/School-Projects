/* Created by Aleksandr 
                       Smirnov
                                */
package lesson23;

import Interfaces.FileCopyFailedException;
import Interfaces.FileCopyUtils;
import Interfaces2.CopyFileTask;
import Interfaces2.TaskExecutionFailedException;

public class CopyFileTaskImpl extends TaskImpl implements CopyFileTask {
    private String fileFrom;
    private String fileTo;
    private FileCopyUtils copyUtils;

    public CopyFileTaskImpl() {

    }

    public CopyFileTaskImpl(String fileFrom, String fileTo, FileCopyUtils copyUtils) {
        this.fileFrom = fileFrom;
        this.fileTo = fileTo;
        this.copyUtils = copyUtils;
    }


    @Override
    public void execute() throws TaskExecutionFailedException, FileCopyFailedException {
        try {
            copyUtils.copyFile(fileFrom, fileTo);
        } catch (Exception e) {
            throw new FileCopyFailedException(e.getMessage());
        }
    }

    @Override
    public void setFileCopyUtils(FileCopyUtils copyUtils) {
        this.copyUtils = copyUtils;
    }

    @Override
    public String toString() {
        return "CopyFileTaskImpl{" +
                "fileFrom='" + fileFrom + '\'' +
                ", fileTo='" + fileTo + '\'' +
                ", copyUtils=" + copyUtils +
                '}';
    }
}
