/* Created by Aleksandr 
                       Smirnov
                                */
package lesson22;

public class Mikhailov extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Monitors.MIC){
                try {
                    Monitors.MIC.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < 2; i++) {
                System.out.println("Vsio dlia tebya!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Monitors.MIC){
                Monitors.MIC.notify();
            }
        }

    }
}
