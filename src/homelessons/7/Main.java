/*
Created by Aleksandr
                    Smirnov*/
package homelesson7;

public class Main {
    public static void main(String[] args) {
        String str = new String("Создать клАсс StringUtils с методамИ");
        System.out.println("Оригинал строки: " + str);
        System.out.println("Строка наоборот: " + homelesson7.StringUtils.reverse(str));
        System.out.println(homelesson7.StringUtils.countGlass(str) + " гласных");
        System.out.println(homelesson7.StringUtils.countSoglasnie(str) + " согласных");
    }
}
