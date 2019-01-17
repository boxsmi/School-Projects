/* Created by Aleksandr 
                       Smirnov
                                */
package lesson7;

import java.util.Scanner;

public class Calculator {
    public static int getInt() {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        String inputNumber = scanner.nextLine();
        char[] inputNumbersToChars = inputNumber.toCharArray();
        char currentChar = inputNumbersToChars[0];
        if (currentChar != '0' && currentChar != '1' && currentChar != '2' && currentChar != '3' && currentChar != '4'
                && currentChar != '5' && currentChar != '6' && currentChar != '7' && currentChar != '8'
                && currentChar != '9') {
            System.out.println("Это не число! Повторите ввод!");
            return getInt();
        }
        int number = Integer.parseInt(inputNumber);
        return number;
    }

    public static char getOperation() {
        System.out.println("Введите тип операции:");
        Scanner scanner = new Scanner(System.in);
        String inputOperation = scanner.nextLine();
        char[] inputOperationToChars = inputOperation.toCharArray();
        if (inputOperationToChars.length > 1) {
            System.out.println("Это не тип операции! Повторите ввод!");
            return getOperation();
        }
        char currentChar = inputOperationToChars[0];
        if (currentChar != '+' && currentChar != '-' && currentChar != '*' && currentChar != '/') {
            System.out.println("Это не тип операции! Повторите ввод!");
            return getOperation();
        }
        return currentChar;
    }

    public static double calc(int number1, int number2, char operator) {
        if (operator == '*') {
            return number1 * number2;
        }
        if (operator == '/') {
            return number1 / number2;
        }
        if (operator == '+') {
            return number1 + number2;
        }
        return number1 - number2;

    }
}