/* Created by Aleksandr 
                       Smirnov
                                */
package lesson7;

public class Main {
    public static void main(String[] args) {
        int num1 = Calculator.getInt();
        int num2 = Calculator.getInt();
        char operation = Calculator.getOperation();
        double result = Calculator.calc(num1, num2, operation);
        System.out.println(result);
    }
}
