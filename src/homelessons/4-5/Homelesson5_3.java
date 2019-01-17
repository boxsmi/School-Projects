public class Homelesson5_3 {
    public static void main(String[] args) {
        int[] mas1 = {4, 6, 8, 3, 9};
        int[] mas2 = new int[5];
        mas2[4] = mas1[0];
        for (int i = 0; i < 4; i++)
            mas2[i] = mas1[i + 1];
        for (int i = 0; i < 5; i++)
            System.out.print(mas2[i] + " ");

    }
}
