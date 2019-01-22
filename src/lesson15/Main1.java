/* Created by Aleksandr 
                       Smirnov
                                */
package lesson15;

import java.util.HashSet;

public class Main1 {
    public static void main(String[] args) {
        HashSet<String> texsts = new HashSet<>();
        texsts.add("One");
        texsts.add("Two");
        texsts.add("Two");
        texsts.add("Three");
        for (String text : texsts) {
            System.out.println(text);
        }

    }
}
