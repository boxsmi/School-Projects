/* Created by Aleksandr 
                       Smirnov
                                */
package lesson16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortMonets {
    public static Collection<Moneta> sortByYear(Collection<Moneta> monets) {
        ArrayList<Moneta> newMoneta = new ArrayList<>();
        newMoneta.addAll(monets);
        Collections.sort(newMoneta, new Comparator<Moneta>() {
            @Override
            public int compare(Moneta o1, Moneta o2) {
                int year1 = o1.getGod();
                int year2 = o2.getGod();
                if (year1 != year2)
                    return year1 - year2;

                int nominal1 = o1.getNominal();
                int nominal2 = o2.getNominal();
                if (nominal1 != nominal2)
                    return nominal1 - nominal2;

                int stars1 = o1.getNumberOfStars();
                int stars2 = o2.getNumberOfStars();
                if (stars1 != stars2)
                    return stars1 - stars2;
                return 0;
            }
        });
        return newMoneta;
    }
}
