/* Created by Aleksandr 
                       Smirnov
                                */
package lesson17;

//import org.apache.log4j.Logger;

public class Main {
//    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Raiting raiting = new Raiting();
        raiting.addPoint("Арсенал", 5);
        raiting.addPoint("Спартак", 3);
        raiting.addPoint("Динамо", 66);
        raiting.addPoint("ЦСКА", 5);
        raiting.addPoint("Зенит", 2);
        raiting.addPoint("Зенит", 4);
        raiting.printRaiting();
        raiting.printBest();
        System.out.println("-----------");
        raiting.sortRaiting();

//        logger.error("Hello World!!!");
    }
}
