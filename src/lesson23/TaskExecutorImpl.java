/* Created by Aleksandr 
                       Smirnov
                                */
package lesson23;

import Interfaces.FileCopyFailedException;
import Interfaces2.Task;
import Interfaces2.TaskExecutionFailedException;
import Interfaces2.TaskExecutor;
import Interfaces2.TasksStorage;

public class TaskExecutorImpl extends Thread implements TaskExecutor {
    private TasksStorage storage;
    private boolean stopFlag = false;

    @Override
    public TasksStorage getStorage() {
        return this.storage;
    }

    @Override
    public void setStorage(TasksStorage storage) throws NullPointerException {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (!stopFlag) {
            Task task = storage.get();
            System.out.println(Thread.currentThread().getName() + " взял задачу " + task);
            if (task != null) {
                try {
                    System.out.println(Thread.currentThread().getName() + " пробуем выполнить " + task);
                    task.execute();
                    System.out.println(Thread.currentThread().getName() + " задачу выполнил" + task);
                } catch (Exception e) {
                    if (task.getTryCount() < 5) {
                        System.out.println(Thread.currentThread().getName() + " не получилось выполнить, ***ВОЗВРАТ*** " + task);
                        task.incTryCount();
                        storage.add(task);
                    } else {
                        System.err.println("Задача " + task + " не выполнима!");
                    }
                }
            } else {
                stopFlag = true;
            }
        }

    }
}
