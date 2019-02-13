/* Created by Aleksandr 
                       Smirnov
                                */
package lesson22;

public class Baskov extends Thread {
    private boolean stop = false;
    @Override
    public void run() {
        int count =0;
        while (!stop) {
            for (int i = 0; i < 3; i++) {
                System.out.println("La La La");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count++;
            if(count == 4){
                stop=true;
            }
            synchronized (Monitors.MIC){
                Monitors.MIC.notify();
            }
            synchronized (Monitors.MIC) {
                try {
                    Monitors.MIC.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
