public class Homelesson5_5 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int denom1 = 8;
        int denom2 = 6;
        int nok = 1;
        while (nok > 0) {
            nok++;
            if (nok % denom1 == 0 && nok % denom2 == 0) {
                System.out.println("Наименьшим общим знаменателем дробей будет число " + nok);
                break;
            }
        }
    }
}