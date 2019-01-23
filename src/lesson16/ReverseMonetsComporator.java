/* Created by Aleksandr 
                       Smirnov
                                */
package lesson16;

import java.util.Comparator;

public class ReverseMonetsComporator implements Comparator<Moneta> {
    @Override
    public int compare(Moneta o1, Moneta o2) {
        int year1 = o1.getGod();
        int year2 = o2.getGod();
        if (year1 != year2)
            return year2 - year1;

        int nominal1 = o1.getNominal();
        int nominal2 = o2.getNominal();
        if (nominal1 != nominal2)
            return nominal2 - nominal1;

        int stars1 = o1.getNumberOfStars();
        int stars2 =o2.getNumberOfStars();
        if (stars1!=stars2)
            return stars2-stars1;
        return 0;
    }
}
