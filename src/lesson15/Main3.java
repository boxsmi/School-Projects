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
    }
}
