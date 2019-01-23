/* Created by Aleksandr 
                       Smirnov
                                */
package lesson16;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Moneta moneta0 = new Moneta(1,1956,4,"metallic");
        Moneta moneta1 = new Moneta(5,1975,9,"alluminium");
        Moneta moneta2 = new Moneta(10,1815,2,"gold");
        Moneta moneta3 = new Moneta(50,1912,3,"silver");
        Moneta moneta4 = new Moneta(10,1999,5,"metallic");
        Moneta moneta5 = new Moneta(100,1999,5,"metallic");

        TreeSet<Moneta> monets = new TreeSet<>();
        monets.add(moneta0);
        monets.add(moneta1);
        monets.add(moneta2);
        monets.add(moneta3);
        monets.add(moneta4);
        monets.add(moneta5);

        for (Iterator<Moneta>iterator = monets.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }

        System.out.println("----------");
        TreeSet<Moneta> monets2 = new TreeSet<>(new Comparator<Moneta>() {
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
        });
        monets2.add(moneta0);
        monets2.add(moneta1);
        monets2.add(moneta2);
        monets2.add(moneta3);
        monets2.add(moneta4);
        monets2.add(moneta5);

        for (Iterator<Moneta>iterator = monets2.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }
}


//Второй вариант задания Comporator, с помощью отдельного класса
/*TreeSet<Moneta> monets2 = new TreeSet<>(new ReverseMonetsComporator());
        monets2.add(moneta0);
        monets2.add(moneta1);
        monets2.add(moneta2);
        monets2.add(moneta3);
        monets2.add(moneta4);
        monets2.add(moneta5);

        for (Iterator<Moneta>iterator = monets2.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }*/