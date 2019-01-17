/* Created by Aleksandr 
                       Smirnov
                                */
package lesson8;

public class StringUtil {
    //Метод кодирует строку так, чтобы символ алфавита был равен третьему по порядку после него.
    public static String coding(String message) {
        String alfaLittle = "abcdefghijklmnopqrstuvwxyz";  //строка прописных букв
        String alfaBig = alfaLittle.toUpperCase();         //строка строчных букв
        char[] charsFromMessage = message.toCharArray();  //массив
        for (char currentChar : charsFromMessage) {
            int indexOfLittle = alfaLittle.indexOf(currentChar);    //находим индекс текущего прописного символа
            int indexOfBig = alfaBig.indexOf(currentChar); //находим индекс текущего строчного символа
            int newStart = alfaLittle.length() - 1; //индекс последнего элемента в строке алфавита
            char newChar;
            //если текущий символ не прописной(т.е. не нашли), то работаем со строчными. else - с прописными.
            if (indexOfLittle == -1) {
                indexOfBig += 3;
                //проверка что индекс не больше индекса последнего элемента, если больше то начинаем считать с 0
                if (indexOfBig > newStart)
                    indexOfBig = Math.abs(indexOfBig - (alfaLittle.length()));
                newChar = alfaBig.charAt(indexOfBig);
                System.out.print(newChar);
            } else {
                indexOfLittle += 3;
                if (indexOfLittle > newStart)
                    indexOfLittle = Math.abs(indexOfLittle - (alfaLittle.length()));
                newChar = alfaLittle.charAt(indexOfLittle);
                System.out.print(newChar);
            }
        }
        return null;
    }

    //Метод раскодирует предидущий, чтобы символ алфавита был равен третьему по порядку до него.
    public static String unCoding(String message) {
        String alfaLittle = "abcdefghijklmnopqrstuvwxyz";  //строка прописных букв
        String alfaBig = alfaLittle.toUpperCase();         //строка строчных букв
        char[] charsFromMessage = message.toCharArray();
        for (char currentChar : charsFromMessage) {
            int indexOfLittle = alfaLittle.indexOf(currentChar);//находим индекс текущего прописного символа
            int indexOfBig = alfaBig.indexOf(currentChar);//находим индекс текущего строчного символа
            int newStart = alfaLittle.length(); //длина массива
            char newChar;
            //если текущий символ не прописной(т.е. не нашли), то работаем со строчными. else - с прописными.
            if (indexOfLittle == -1) {
                indexOfBig -= 3;
                //проверка что индекс не меньше индекса первого элемента, если меньше то начинаем считать с конца.
                if (indexOfBig < 0)
                    indexOfBig = newStart + indexOfBig;
                newChar = alfaBig.charAt(indexOfBig);
                System.out.print(newChar);
            } else {
                indexOfLittle -= 3;
                if (indexOfLittle < 0)
                    indexOfLittle = newStart + indexOfLittle;
                newChar = alfaLittle.charAt(indexOfLittle);
                System.out.print(newChar);
            }
        }
        return null;
    }
}


