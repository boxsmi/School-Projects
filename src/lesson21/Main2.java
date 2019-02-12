/* Created by Aleksandr 
                       Smirnov
                                */
package lesson21;

public class Main2 {
    public static void main(String[] args) {
        Thread myThread2 = new Thread(new MyThreadWithRunnable());
        myThread2.start();
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                MyThread myThread = new MyThread();
                myThread.start();
            }
            Thread.currentThread().setName("TEST");
            System.out.println(i + "---->" + Thread.currentThread().getName());
            try {
                java.lang.Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
