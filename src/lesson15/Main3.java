/*
Created by Aleksandr
                    Smirnov*/
package lesson15;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<String> stringsList = new ArrayList<>();
        ListUtilsImpl object = new ListUtilsImpl();
        stringsList = object.asList("Раз", "Два", "Три", "Четыре", "Пять");
        System.out.println(stringsList);

        List<Double> doubleList = new ArrayList<Double>();
        doubleList.add(4.5);
        doubleList.add(5.0);
        doubleList.add(5.5);
        doubleList.add(6.0);
        doubleList.add(6.5);
        doubleList.add(7.0);
        ListUtilsImpl object1 = new ListUtilsImpl();
        doubleList = object1.sortedList(doubleList);
        for (Double temp : doubleList){
            System.out.println(temp);
        }
    }
}
