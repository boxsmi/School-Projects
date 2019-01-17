package lesson_1_2;

public class Main1 {
    public static void main(String[] args) {
        double lenghtRoom = 4.5;
        double weightRoom = 3.5;
        double squareRoom = lenghtRoom*weightRoom;
        double lenghtTable = 1;
        double heightTable = 1.5;
        double squareTable = lenghtTable*heightTable;
        int result = (int)(squareRoom/squareTable);
        System.out.println("В комнате будет " + result + " столов");
    }
}
