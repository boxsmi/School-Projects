package homelessons;

public class Homelesson1 {
    public static void main(String[] args) {
        int sideA = 5, sideB = 5, sideC = 5;
        if ((sideA == sideB && sideA != sideC) || (sideB == sideC && sideB !=sideA) || (sideA ==sideC && sideA !=sideB))
            System.out.println("РАВНОБЕДРЕННЫЙ");
        else if ((sideA == sideB) && (sideA == sideC) && (sideB == sideC))
            System.out.println("РАВНОСТОРОННИЙ");
        else
            System.out.println("РАЗНОСТОРОННИЙ");
        }
    }

