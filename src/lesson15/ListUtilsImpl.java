/*
Created by Aleksandr
                    Smirnov*/
package lesson15;

import Interfaces.ListUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListUtilsImpl implements ListUtils {

    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null) throw new IllegalArgumentException("strings" + i + "=null!!!");
        }
        List<String> listOfStrings = new ArrayList<>();
        for (String temp : strings) {
            listOfStrings.add(temp);
        }
        return listOfStrings;
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        if (data == null)
            throw new IllegalArgumentException("No data!!!");
        List<Double> newSortedList = data;
        Collections.sort(newSortedList, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return o2.compareTo(o1);
            }
        });
        return newSortedList;
    }


}
