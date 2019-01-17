/* Created by Aleksandr 
                       Smirnov
                                */
package lesson11;

public class Monkey extends Animal {
    @Override
    public void voice() {
        System.out.println("Uaaaa");
    }

    @Override
    public void run() {
        System.out.println("Run Monkey");
    }

    @Override
    public void jump() {
        System.out.println("Jump Monkey");
    }
}
