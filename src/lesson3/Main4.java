package lesson3;

public class Main4 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int ind = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                a[ind] = i;
                ind++;
            }
            if (ind == 10)
                break;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }
}

