/*
Created by Aleksandr
                    Smirnov*/
package dns;

public class Drivers {
    private String nameOfFile;
    private String pathToFile;

    public Drivers() {
    }

    public Drivers(String nameOfFile, String pathToFile) {
        this.nameOfFile = nameOfFile;
        this.pathToFile = pathToFile;
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

    @Override
    public String toString() {
        return "Drivers{" +
                "nameOfFile='" + nameOfFile + '\'' +
                ", pathToFile='" + pathToFile + '\'' +
                '}';
    }
}
