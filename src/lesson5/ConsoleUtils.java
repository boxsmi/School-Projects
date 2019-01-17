/* Created by Aleksandr 
                       Smirnov
                                */
package lesson5;

import java.util.Scanner;

public class ConsoleUtils {
    public static void PrintPrivetByNumber() {
        System.out.println("Введите число: ");
        //формула создания объекта
        //
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        for (int i = 0; i < inputNumber; i++) {
            System.out.println("Привет");
        }
    }
}
