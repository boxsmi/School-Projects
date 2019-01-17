/* Created by Aleksandr 
                       Smirnov
                                */
package lesson12;

public class Main {
    public static void main(String[] args) {

        Photo photo = new Photo("https://kupit-skovorodu.ru/upload/iblock/0f2/52.jpg", "Кастрюля 7,0 литров с рисунком СТАЛЬЭМАЛЬ Сталь эмалированная");
        Photo photo1 = new Photo("https://kupit-skovorodu.ru/upload/iblock/515/53.jpg", "Кастрюля 7,0 литров с рисунком СТАЛЬЭМАЛЬ Сталь эмалированная");
        Photo[] masPhoto = new Photo[]{photo, photo1};
        Kharakteristika kharakteristika = new Kharakteristika(26, 7, "Сталь эмалированная", 1900, "выс. 16 см");
        Tovar yellowKastrulya = new Tovar();
        yellowKastrulya.setMainName("Кастрюля 7,0 литров с рисунком СТАЛЬЭМАЛЬ Сталь эмалированная");
        yellowKastrulya.setArticul("1с18с");
        yellowKastrulya.setPrice(790);
        yellowKastrulya.setKharakteristika(kharakteristika);
        yellowKastrulya.setMainInfo("Кастрюля эмалированная СтальЭмаль изготовлена из высококачественного стального проката, покрытого двумя слоями жаропрочной эмали. ");
        yellowKastrulya.setShortPhoto(photo);
        yellowKastrulya.addFototoDopPhotos(photo);
        yellowKastrulya.addFototoDopPhotos(photo1);

        System.out.println(yellowKastrulya);

        Photo photo2 = new Photo("https://kupit-skovorodu.ru/upload/iblock/452/23.jpg", "Жаровня 280 мм чугунная с 2-мя ручками БИОЛ без крышки");
        Photo photo3 = new Photo("https://kupit-skovorodu.ru/upload/iblock/f57/25.jpg", "Жаровня 280 мм чугунная с 2-мя ручками БИОЛ без крышки");
        Photo[] masPhoto1 = new Photo[]{photo2, photo3};
        Kharakteristika kharakteristika1 = new Kharakteristika(28, 8, "Чугун черный", 2500, "высота 66 мм");
        Tovar jarovnya = new Tovar();
        jarovnya.setMainName("Жаровня 280 мм чугунная с 2-мя ручками БИОЛ без крышки");
        jarovnya.setArticul("3281");
        jarovnya.setPrice(1710);
        jarovnya.setKharakteristika(kharakteristika1);
        jarovnya.setMainInfo("Жаровня с двумя ручками отлично подходит для жарки и тушения, а также хранения в холодильнике. Утолщенное дно предотвращает от деформации и увеличивает скорость приготовления пищи ");
        jarovnya.setShortPhoto(photo2);
        jarovnya.addFototoDopPhotos(photo2);
        jarovnya.addFototoDopPhotos(photo3);

        System.out.println(jarovnya);

        TovarFilter.printChippestTovar(yellowKastrulya, jarovnya);

    }
}
