/* Created by Aleksandr 
                       Smirnov
                                */
package lesson23;

import lesson20.FileCopyWithChannels;
import lesson20.FileCopyWithJava7CopyUtils;
import lesson20.FileCopyWithOneByte;
import lesson20.FileCopyWithStandartUtils;

public class Main {
    public static void main(String[] args) {
        CopyFileTaskImpl copyTask1 = new CopyFileTaskImpl("D:\\ar.rar", "D:\\copyTask1.rar", new FileCopyWithChannels());
        CopyFileTaskImpl copyTask2 = new CopyFileTaskImpl("D:\\ar1.rar", "D:\\copyTask2.rar", new FileCopyWithJava7CopyUtils());
        CopyFileTaskImpl copyTask3 = new CopyFileTaskImpl("D:\\ar2.rar", "D:\\copyTask3.rar", new FileCopyWithOneByte());
        CopyFileTaskImpl copyTask4 = new CopyFileTaskImpl("D:\\ar3.rar", "D:\\copyTask4.rar", new FileCopyWithStandartUtils());
        CopyFileTaskImpl copyTask5 = new CopyFileTaskImpl("D:\\arh.rar", "D:\\copyTask5.rar", new FileCopyWithStandartUtils());

        FindFileTaskImpl findTask1 = new FindFileTaskImpl("D:\\JAVA", "*.txt", System.out);
        FindFileTaskImpl findTask2 = new FindFileTaskImpl("D:\\JAVA", "*.bin", System.out);
        FindFileTaskImpl findTask3 = new FindFileTaskImpl("D:\\JAVA\\Projects", "*.iml", System.out);
        FindFileTaskImpl findTask4 = new FindFileTaskImpl("D:\\JAVA", "*.dat", System.out);
        FindFileTaskImpl findTask5 = new FindFileTaskImpl("D:\\JAVA\\jvm", "*.dat", System.out);

        TasksStorageImpl storage1 = new TasksStorageImpl();
        storage1.add(copyTask5);
        storage1.add(copyTask3);
        storage1.add(copyTask4);
        storage1.add(copyTask2);
        storage1.add(copyTask1);

        storage1.add(findTask1);
        storage1.add(findTask3);
        storage1.add(findTask2);
        storage1.add(findTask5);
        storage1.add(findTask4);

        TaskExecutorImpl executor1 = new TaskExecutorImpl();
        executor1.setStorage(storage1);
        TaskExecutorImpl executor2 = new TaskExecutorImpl();
        executor2.setStorage(storage1);
        TaskExecutorImpl executor3 = new TaskExecutorImpl();
        executor3.setStorage(storage1);

        executor1.start();
        executor2.start();
        executor3.start();


    }
}
