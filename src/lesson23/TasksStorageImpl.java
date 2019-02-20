/* Created by Aleksandr 
                       Smirnov
                                */
package lesson23;

import Interfaces2.Task;
import Interfaces2.TasksStorage;

import java.util.LinkedList;

public class TasksStorageImpl implements TasksStorage {
    private LinkedList<Task> tasks= new LinkedList<>();


    @Override
    public synchronized void add(Task task) throws NullPointerException {
        tasks.add(task);
    }

    @Override
    public synchronized Task get() {
        return tasks.poll();
    }

    @Override
    public synchronized int count() {
        return tasks.size();
    }
}
