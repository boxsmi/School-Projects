/* Created by Aleksandr 
                       Smirnov
                                */
package lesson23;

import Interfaces2.Task;
import Interfaces2.TaskExecutionFailedException;

public abstract class TaskImpl implements Task {
    private int countTry = 0;


    @Override
    public int getTryCount() {
        return 0;
    }

    @Override
    public void incTryCount() {
    countTry++;
    }

}
