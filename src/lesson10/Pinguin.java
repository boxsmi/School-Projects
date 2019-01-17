/* Created by Aleksandr 
                       Smirnov
                                */
package lesson10;

public class Pinguin extends Animal{
    @Override
    public void printAnimal() {
        System.out.println("Pinguin: name - " + this.getName() + ", cost  - " + this.getCost());
    }
}
