package homelessons;

public class Homelesson5_1 {
    public static void main(String[] args) {
        char[] arr = {'а', 'о', 'е', 'ю', 'г', 'т', 'и', 'п', 'о', 'а'};
        char[] vowels = {'а', 'и', 'е', 'ё', 'о', 'у', 'ы', 'э', 'ю', 'я'};
        int count = 0;
        for (char i : arr) {
            for (char j : vowels) {
                if (i == j)
                    count++;
            }
        }
        System.out.println(count + " гласных");
    }
}
