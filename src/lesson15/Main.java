/* Created by Aleksandr 
                       Smirnov
                                */
package lesson15;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        numbers.add(11);
        numbers.add(15);
        numbers.add(1, 6);
        numbers.set(2, 0);
        //первый способ прохождения по колекции
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println("");
        System.out.println("-------------");
        //второй способ прохождения по колекции
        for (Integer i : numbers) {
            System.out.print(i + " ");

        }
        System.out.println("");
        System.out.println("-------------");
        //3-й способ прохождения по колекции с помощью итератора
        for (Iterator<Integer> iter = numbers.iterator(); iter.hasNext(); ) {
            System.out.print(iter.next() + " ");

        }
    }
}
