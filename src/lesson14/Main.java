/* Created by Aleksandr 
                       Smirnov
                                */
package lesson14;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(100);
        } catch (CurrentAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
