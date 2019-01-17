/*
Created by Aleksandr
                    Smirnov*/
package dns;

public class Drivers {
    private String nameOfFile;
    private String pathToFile;
    private double sizeOfFile;

    public Drivers() {
    }

    public Drivers(String nameOfFile, String pathToFile, double sizeOfFile) {
        this.nameOfFile = nameOfFile;
        this.pathToFile = pathToFile;
        this.sizeOfFile = sizeOfFile;
    }

    public String getNameOfFile() {
        return nameOfFile;
    }

    public void setNameOfFile(String nameOfFile) {
        this.nameOfFile = nameOfFile;
    }

    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public double getSizeOfFile() {
        return sizeOfFile;
    }

    public void setSizeOfFile(double sizeOfFile) {
        this.sizeOfFile = sizeOfFile;
    }
}
