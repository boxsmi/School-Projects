/* Created by Aleksandr 
                       Smirnov
                                */
package lesson11;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Monkey monkey = new Monkey();
       Animal [] zoo = new Animal[10];
        zoo[0] = tiger;
        zoo[1] = monkey;
        zoo[0].getAge();
    }
}
