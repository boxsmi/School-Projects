/* Created by Aleksandr 
                       Smirnov
                                */
package homelessons;

public class Homelesson3_4 {
    public static void main(String[] args) {
        char[] massivOne = {'a', 'b', 'c', 'd'};
        char[] massivTwo = {'q', 'w', 'e', 'r'};
        char[] massivThree = new char[massivOne.length + massivTwo.length];
        int indOne = massivOne.length - 1;
        for (int i = 0; i <= indOne; i++) {
            massivThree[i] = massivOne[i];
        }
        int indTwo = massivThree.length - 1;
        int indThree = 0;
        for (int i = massivOne.length; i <= indTwo; i++) {
            massivThree[i] = massivTwo[indThree];
            indThree++;
        }
        for (int i = 0; i <= massivThree.length - 1; i++) {
            System.out.print(massivThree[i] + " ");
        }
    }
}
