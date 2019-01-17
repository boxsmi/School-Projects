/* Created by Aleksandr 
                       Smirnov
                                */
package lesson9;

public class Book {
    private int countStr;
    private String name;
    private String author;
    private int year;
    private String pereplet;
    private int weight;
    private int height;
    private int length;

    public Book() {
    }

    public Book(String authorOfBook, String nameOfBook, int yearOfBook) {
        author = authorOfBook;
        name = nameOfBook;
        year = yearOfBook;
    }

    public Book(int countStranic, String authorOfBook, String nameOfBook, int yearOfBook, String perepletBook,
                int weightBook, int heightBook, int lengthBook) {
        countStr = countStranic;
        author = authorOfBook;
        name = nameOfBook;
        year = yearOfBook;
        pereplet = perepletBook;
        weight = weightBook;
        height = heightBook;
        weight = weightBook;
    }

    public int getCountStr() {
        return countStr;
    }

    public void setCountStr(int newCountStr) {
        countStr = newCountStr;
    }

    public void print() {
        System.out.println("Book" + " " + author + " " + name + " " + countStr);
    }

}