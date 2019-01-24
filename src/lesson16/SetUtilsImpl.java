/*
Created by Aleksandr
                    Smirnov*/
package lesson16;

import Interfaces.SetUtils;

import java.util.*;

public class SetUtilsImpl implements SetUtils {
    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {
        if (collection1 == null || set2 == null)
            throw new NullPointerException("collection1 == null || set2 == null");
        TreeSet<String> stringNumbers = new TreeSet<>();
        for (Integer temp : collection1) {
            stringNumbers.add(Integer.toString(temp));
        }
        stringNumbers.addAll(set2);
        return stringNumbers.descendingSet();
    }

    @Override
    public Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5) {
        LinkedHashSet <Integer> customSet  = new LinkedHashSet<>();
        customSet.add(val1);
        customSet.add(val2);
        customSet.add(val3);
        customSet.add(val4);
        customSet.add(val5);
        return customSet;
    }
}

