/* Created by Aleksandr 
                       Smirnov
                                */
package lesson16;

import java.util.Collection;
import java.util.HashSet;

public class Main3 {
    public static void main(String[] args) {
        Moneta moneta0 = new Moneta(1,1956,4,"metallic");
        Moneta moneta1 = new Moneta(5,1975,9,"alluminium");
        Moneta moneta2 = new Moneta(10,1815,2,"gold");
        Moneta moneta3 = new Moneta(50,1912,3,"silver");
        Moneta moneta4 = new Moneta(10,1999,5,"metallic");
        Moneta moneta5 = new Moneta(100,1999,5,"metallic");
        HashSet <Moneta> monets = new HashSet<>();
        monets.add(moneta0);
        monets.add(moneta1);
        monets.add(moneta2);
        monets.add(moneta3);
        monets.add(moneta4);
        monets.add(moneta5);

        Collection<Moneta> result = SortMonets.sortByYear(monets);
        for(Moneta moneta:result){
            System.out.println(moneta);
        }
    }
}
