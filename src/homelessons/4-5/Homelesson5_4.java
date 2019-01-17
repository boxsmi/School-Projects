public class Homelesson5_4 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        int figure = 0;
        int ind = 0;
        while (arr[6] == 0) {
            figure++;
            if (figure % 4 == 0) {
                for (int i = ind; i < 8; i++) {
                    arr[i] = figure;
                    ind++;
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
