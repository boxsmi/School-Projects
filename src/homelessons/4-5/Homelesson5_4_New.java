package homelessons;

public class Homelesson5_4_New {
    public static void main(String[] args) {
        int[] arr = new int[7];
        int x = 0;
        for (int i = 0; i < 7; i++) {
            arr[i] = x + 4;
            x += 4;
            System.out.print(arr[i] + " ");
        }
    }
}
