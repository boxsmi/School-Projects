/*
Created by Aleksandr
                    Smirnov*/
package homelesson7;

import java.util.Scanner;

public class StringUtils {
    //Возвращаем входящий текст (String text) в обратном порядке
    public static String reverse(String text) {
        char[] charArray = text.toCharArray();
        String result = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            result += charArray[i];
        }
        return result;
    }

    //Метод должен возвращать количество гласных букв в тексте (String text),
    //метод должен считать как большие так и маленькие гласные буквы
    public static int countGlass(String text) {
        String lowerText = text.toLowerCase();
        char[] charArray = lowerText.toCharArray();
        char[] vowels = {'а', 'и', 'е', 'ё', 'о', 'у', 'ы', 'э', 'ю', 'я'};
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (charArray[i] == vowels[j])
                    count++;
            }
        }
        return count;
    }

    //Метод должен возвращать количество согласных букв в тексте (String text),
    // метод должен считать как большие так и маленькие буквы
    public static int countSoglasnie(String text) {
        String upperText = text.toUpperCase();
        char[] charArray = upperText.toCharArray();
        char[] consonants = {'Б', 'В', 'Г', 'Д', 'Ж', 'З', 'Й', 'К', 'Л', 'М', 'Н', 'П', 'Р', 'С', 'Т', 'Ф',
                             'Х', 'Ц', 'Ч', 'Ш', 'Щ'};
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < consonants.length; j++) {
                if (charArray[i] == consonants[j])
                    count++;
            }
        }
        return count;

    }
}
