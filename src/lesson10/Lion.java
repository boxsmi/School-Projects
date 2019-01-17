/* Created by Aleksandr 
                       Smirnov
                                */
package lesson10;

public class Lion extends Animal {
    @Override
    public void printAnimal() {
        System.out.println("Lion: name - " + this.getName() + ", cost  - " + this.getCost());
    }
}
