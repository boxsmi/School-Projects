package homelessons;

public class Homelesson2 {
    public static void main(String[] args) {
        int widthBox = 30, heightBox = 20, lengthBox = 40;
        int widthBrick = 15, heightBrick = 10, lenghtBrick = 7;
        int dimensionBox = widthBox*heightBox*lengthBox;
        int dimensionBrick = widthBrick*heightBrick*lenghtBrick;
        System.out.println("Влезет " + dimensionBox/dimensionBrick + " кубика");
    }
}
