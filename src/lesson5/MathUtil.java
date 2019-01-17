/* Created by Aleksandr 
                       Smirnov
                                */
package lesson5;

public class MathUtil {
    //метод
    //первое слово-модификатор доступа + статичность + возвращаемый тип(void если ничего не возвращает)+ имя + (параметры) + тело
    public static int summaChisel(int chislo1, int chislo2) {
        int summa = chislo1 + chislo2;
        return summa;
    }

    public static int naimObshKrat(int chislo1, int chislo2) {
        for (int i = 1; i <= chislo1 * chislo2; i++) {
            if (i % chislo1 == 0 && i % chislo2 == 0) {
                return i;
            }
        }
        return chislo1*chislo2;
    }
}
