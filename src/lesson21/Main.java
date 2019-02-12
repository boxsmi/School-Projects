/* Created by Aleksandr 
                       Smirnov
                                */
package lesson21;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
        // Сериализация
        java.io.ObjectOutputStream ois = new java.io.ObjectOutputStream(new java.io.FileOutputStream("state.bin"));
        ois.writeDouble(3.14159265D);
        ois.writeObject("The value of PI");
        ois.writeObject(new Point(10,253)); //запись объекта класса Point
        ois.flush();
        ois.close();}
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
