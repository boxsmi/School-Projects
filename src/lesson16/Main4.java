/*
Created by Aleksandr
                    Smirnov*/
package lesson16;

import java.util.TreeSet;

public class Main4 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        TreeSet<String> texsts = new TreeSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        texsts.add("раз");
        texsts.add("два");
        texsts.add("три");
        texsts.add("четыре");
        texsts.add("пять");
        texsts.add("шесть");

        SetUtilsImpl object = new SetUtilsImpl();
        System.out.println(object.orderedSet(numbers, texsts));

        SetUtilsImpl object3 = new SetUtilsImpl();
        System.out.println(object3.customOrderSet(1,2,3,4,5));

    }
}
