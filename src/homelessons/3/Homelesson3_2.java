/* Created by Aleksandr 
                       Smirnov
                                */
package homelessons;

public class Homelesson3_2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 4 == 0 && i % 7 == 0 && i != 0) //Последнее условие (i!=0) можно убрать, тогда выведет еще 0.
                System.out.println(i);
        }
    }
}
