/*
Created by Aleksandr
                    Smirnov*/
package dns;
                //Выводит товар, лучший по оценке пользователей.
public class TovarFilter {
    public static void printBestTovarByRating(Tovar tovar1, Tovar tovar2){
        if (tovar1.getMark()<tovar2.getMark())
            System.out.println("Лучший по оценкам: " + tovar2.getMainName());
        else
            System.out.println("Лучший по оценкам: " + tovar1.getMainName());
    }
}
