/* Created by Aleksandr 
                       Smirnov
                                */
package lesson10;

public class Monkey extends Animal{
    @Override
    public void printAnimal() {
        System.out.println("Monkey: name - " + this.getName() + ", cost  - " + this.getCost());
    }
}
