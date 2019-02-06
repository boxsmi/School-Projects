/* Created by Aleksandr 
                       Smirnov
                                */
package lesson17;

import java.util.*;

public class Raiting {

    private HashMap<String, Integer> raiting = new HashMap<>();

    public Raiting() {
    }

    public void addPoint(String command, int point) {
        if (raiting.containsKey(command)) {
            int currentPoint = raiting.get(command);
            raiting.put(command, currentPoint + point);
        } else {
            raiting.put(command, point);
        }
    }

    public void printRaiting() {
        Set<String> commands = raiting.keySet();
        for (String elem : commands) {
            System.out.println(elem + " ------- " + raiting.get(elem));
        }
    }

    public void printBest() {
        Set<String> commands = raiting.keySet();
        int best = 0;
        String name = "";
        for (String elem : commands) {
            if (raiting.get(elem) > best) {
                best = raiting.get(elem);
                name = elem;
            }
        }
        System.out.println(name + " --->>> " + best);
    }

    public void sortRaiting(){
//
    }

}
