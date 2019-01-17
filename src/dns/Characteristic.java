/*
Created by Aleksandr
                    Smirnov*/
package dns;

public class Characteristic {

    private String nameOfCharacteristic;
    private String section;
    private String type;
    private String typeValue;

    Characteristic() {
    }

    public Characteristic(String nameOfCharacteristic, String section, String type, String typeValue) {
        this.nameOfCharacteristic = nameOfCharacteristic;
        this.section = section;
        this.type = type;
        this.typeValue = typeValue;
    }

    public String getNameOfCharacteristic() {
        return nameOfCharacteristic;
    }

    public void setNameOfCharacteristic(String nameOfCharacteristic) {
        this.nameOfCharacteristic = nameOfCharacteristic;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeValue() {
        return typeValue;
    }

    public void setTypeValue(String typeValue) {
        this.typeValue = typeValue;
    }
}
