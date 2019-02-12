/* Created by Aleksandr 
                       Smirnov
                                */
package lesson21;

public class MyThreadWithRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 1000; i < 1010; i++) {
            System.out.println(i+ "---->" + Thread.currentThread().getName());
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
