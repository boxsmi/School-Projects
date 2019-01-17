package lesson_1_2;

public class Main {
    public static void main(String[] args) {
        int money = 300;
        int toy = 52;
        int gum = 10;
        int candy = 2;
        int buyToy = money/toy;
        int restAfterToy = money%toy;
        int buyGum = restAfterToy/gum;
        int restAfterGum = restAfterToy%gum;
        int buyCandy = restAfterGum/candy;
        int restAfterAll = restAfterGum%candy;
        System.out.println("Вы купили " + buyToy + " игрушек, " + buyGum + " жвачек и " + buyCandy + " конфет");
        System.out.println("Остаток: " + restAfterAll);
    }
}
