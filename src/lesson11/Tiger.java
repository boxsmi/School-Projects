/* Created by Aleksandr 
                       Smirnov
                                */
package lesson11;

public class Tiger extends Animal {

    @Override
    public void voice() {
        System.out.println("rrooooar");
    }

    @Override
    public void run() {
        System.out.println("Run Tiger");
    }

    @Override
    public void jump() {
        System.out.println("Jump Tiger");
    }
}
