package lesson3;

// int[] a = new int[размер];
public class Main3 {
    public static void main(String[] args) {
        int[] massiv = new int[7];
        int ind = 7;
        for (int i = 0; i < 7; i++) {
            massiv[i] = ind;
            ind--;
            System.out.println(massiv[i]);
        }
    }
}
