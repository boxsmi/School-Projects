/* Created by Aleksandr 
                       Smirnov
                                */
package lesson16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> texts = new ArrayList<>();
        texts.add("Раз");
        texts.add("Два");
        texts.add("Три");
        texts.add("Четыре");
        texts.add("Пять");
        Collections.sort(texts, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        for(String text : texts){
            System.out.println(text);
        }
    }
}
