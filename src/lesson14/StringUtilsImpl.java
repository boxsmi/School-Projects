/* Created by Aleksandr 
                       Smirnov
                                */
package lesson14;

import Interfaces.CustomException;
import Interfaces.StringUtils;

public class StringUtilsImpl implements StringUtils {

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 == null || number2 == null");
        }
        try {
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);
            if (num2 == 0) {
                throw new ArithmeticException("Number2 can't be 0!");
            }
            return num1 / num2;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("number1 || number2 not a chislo");
        }

    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        return new int[0];
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }
}
