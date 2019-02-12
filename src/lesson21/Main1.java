/* Created by Aleksandr 
                       Smirnov
                                */
package lesson21;

import java.io.IOException;

public class Main1 {
    public static void main(String[] args) {
        try{
            // Десериализация
            java.io.ObjectInputStream ois = new java.io.ObjectInputStream(new java.io.FileInputStream("state.bin"));
            System.out.println("Double: " + ois.readDouble());
            System.out.println("String: " + ois.readObject().toString());
            System.out.println("Point: " + (Point) ois.readObject());
            ois.close();
        }
        catch(Exception e){

        }
    }
}
