/* Created by Aleksandr 
                       Smirnov
                                */
package lesson10;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Monkey monkey = new Monkey();
        Pinguin pinguin = new Pinguin();
        Lion lion1 = new Lion();
        Monkey monkey1 = new Monkey();
        Pinguin pinguin1 = new Pinguin();
        lion.printAnimal();
        monkey.printAnimal();
        pinguin.printAnimal();
        lion1.printAnimal();
        monkey1.printAnimal();
        pinguin1.printAnimal();
        pinguin.setCost(10000);
        pinguin1.setCost(10000);
        pinguin.setName("Pin");
        pinguin1.setName("Pin");
        System.out.println(pinguin.equals(pinguin1));
        System.out.println(pinguin);

    }
}
