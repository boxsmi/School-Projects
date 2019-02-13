/* Created by Aleksandr 
                       Smirnov
                                */
package lesson22;

public class Vedushiy {
    public static void main(String[] args) {
        System.out.println("Start!");
        Baskov kolya = new Baskov();
        Mikhailov stas = new Mikhailov();
        stas.setDaemon(true);
        kolya.start();
        stas.start();
        while(kolya.isAlive()){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finish");
    }
}
