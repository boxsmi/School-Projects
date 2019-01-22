/* Created by Aleksandr 
                       Smirnov
                                */
package lesson15;

import java.util.HashSet;
import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(7);
        a.add(13);
        a.add(2);
        a.add(5);
        HashSet<Integer> b = new HashSet<>();
        b.add(1);
        b.add(3);
        b.add(5);
        b.add(7);
        b.add(8);
        CollectionUtilsImpl util = new CollectionUtilsImpl();

        System.out.println(util.union(a, b));

        System.out.println(util.intersection(a,b));

        System.out.println(util.unionWithoutDuplicate(a,b));

        System.out.println(util.intersectionWithoutDuplicate(a,b));

        System.out.println(util.difference(a, b));

    }
}
