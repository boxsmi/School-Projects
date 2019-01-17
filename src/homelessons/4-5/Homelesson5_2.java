public class Homelesson5_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int i = 0;
        int sum = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        System.out.println("Сумма всех элементов равна " + sum);
    }
}
