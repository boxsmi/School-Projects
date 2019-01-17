package lesson_1_2;

public class Main2 {
    public static void main(String[] args) {
        int priceTour = 1500;
        int mounth = 5;
        int cash = 200;
        boolean canBuy = (mounth*cash) >= priceTour && priceTour <= 2000;
        System.out.println(canBuy);
    }
}
