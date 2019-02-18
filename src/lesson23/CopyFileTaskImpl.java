/* Created by Aleksandr 
                       Smirnov
                                */
package lesson23;

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
    public void execute() throws TaskExecutionFailedException {

    }

    @Override
    public void setFileCopyUtils(FileCopyUtils copyUtils) {

    }
}
