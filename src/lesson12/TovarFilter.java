/* Created by Aleksandr 
                       Smirnov
                                */
package lesson12;

public class TovarFilter {
    public static void printChippestTovar(Tovar tovarOne, Tovar tovarTwo) {
        int max = tovarOne.getPrice();
        if (max < tovarTwo.getPrice())
            max = tovarTwo.getPrice();
        System.out.println("Max Price: " + max);
    }
}
