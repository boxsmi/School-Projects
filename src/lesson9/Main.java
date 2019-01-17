/* Created by Aleksandr 
                       Smirnov
                                */
package lesson9;

public class Main {
    public static void main(String[] args) {
        Book pushkin = new Book();
        Book esenin = new Book("Esenin","11111", 1950);
        Book gogol = new Book(200, "Gogol", "Dushi", 1960,
                "Hard", 1,2,4);
        gogol.setCountStr(205);
        pushkin.print();
        esenin.print();
        gogol.print();


    }
}
