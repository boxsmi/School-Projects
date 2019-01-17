/* Created by Aleksandr 
                       Smirnov
                                */
package homelessons;

public class Homelesson3_5 {
    public static void main(String[] args) {
        double moneyDeposit = 10000;
        int percentCount = 9;
        int yearCount = 7;
        double percentSum = 0;
        for (int i = 0; i < yearCount; i++) {
            percentSum = (moneyDeposit / 100) * percentCount;
            moneyDeposit = moneyDeposit + percentSum;
        }
        System.out.printf("Сумма к выплате через 7 лет равна %.2f рублей", moneyDeposit);
    }
}
