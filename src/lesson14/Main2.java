/* Created by Aleksandr 
                       Smirnov
                                */
package lesson14;

public class Main2 {
    public static void main(String[] args) {
        StringUtilsImpl object = new StringUtilsImpl();
        double result = object.div("0", "5");
        System.out.println("result = " + result);

        StringUtilsImpl object2 = new StringUtilsImpl();
        String text = "раз два раз два раз";
        String word = "раз";
        int[] massiv = object2.findWord(text, word);
        for (int i : massiv) {
            System.out.print(i + " ");
        }
        System.out.println();

        FractionNumberImpl fraction = new FractionNumberImpl(1, 4);
        System.out.println(fraction.value());
        System.out.println(fraction);
        fraction.setDivisor(0);
    }
}
