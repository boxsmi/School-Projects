package homelessons;
import static java.lang.Math.*;
public class Homelesson3 {
    public static void main(String[] args) {
        int sideA = 25, sideB = 22, sideC = 35;
        //решаем по формуле Герона
        double halfPerimeter = (sideA+sideB+sideC)/2;
        double square = sqrt(halfPerimeter*(halfPerimeter-sideA)*(halfPerimeter-sideB)*(halfPerimeter-sideC));
        System.out.printf("Площадь треугольника = %.3f", square);
    }
}
