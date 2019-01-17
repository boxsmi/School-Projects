/*
Created by Aleksandr
                    Smirnov*/
package dns;

public class Characteristic {

    private String type;
    private String model;
    private String mainColor;
    private String dopColor;
    private String isTravel;
    private String energy;
    private String materialOfUnderside;
    private String steamStrike;
    private String sprayFunction;
    private String autoOff;
    private String antiDrop;
    private String antiScale;
    private String wirelessUse;
    private String cleaningSystem;
    private String buttonPlace;
    private String circleCordMounting;
    private double cordLenght;
    private String complectation;
    private String dopInfo;

    Characteristic() {
    }

    public Characteristic(String type, String model, String mainColor, String dopColor, String isTravel,
                          String energy, String materialOfUnderside, String steamStrike, String sprayFunction,
                          String autoOff, String antiDrop, String antiScale, String wirelessUse, String cleaningSystem,
                          String buttonPlace, String circleCordMounting, double cordLenght,
                          String complectation, String dopInfo) {
        this.type = type;
        this.model = model;
        this.mainColor = mainColor;
        this.dopColor = dopColor;
        this.isTravel = isTravel;
        this.energy = energy;
        this.materialOfUnderside = materialOfUnderside;
        this.steamStrike = steamStrike;
        this.sprayFunction = sprayFunction;
        this.autoOff = autoOff;
        this.antiDrop = antiDrop;
        this.antiScale = antiScale;
        this.wirelessUse = wirelessUse;
        this.cleaningSystem = cleaningSystem;
        this.buttonPlace = buttonPlace;
        this.circleCordMounting = circleCordMounting;
        this.cordLenght = cordLenght;
        this.complectation = complectation;
        this.dopInfo = dopInfo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMainColor() {
        return mainColor;
    }

    public void setMainColor(String mainColor) {
        this.mainColor = mainColor;
    }

    public String getDopColor() {
        return dopColor;
    }

    public void setDopColor(String dopColor) {
        this.dopColor = dopColor;
    }

    public String getIsTravel() {
        return isTravel;
    }

    public void setIsTravel(String isTravel) {
        this.isTravel = isTravel;
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
    }

    public String getMaterialOfUnderside() {
        return materialOfUnderside;
    }

    public void setMaterialOfUnderside(String materialOfUnderside) {
        this.materialOfUnderside = materialOfUnderside;
    }

    public String getSteamStrike() {
        return steamStrike;
    }

    public void setSteamStrike(String steamStrike) {
        this.steamStrike = steamStrike;
    }

    public String getSprayFunction() {
        return sprayFunction;
    }

    public void setSprayFunction(String sprayFunction) {
        this.sprayFunction = sprayFunction;
    }

    public String getAutoOff() {
        return autoOff;
    }

    public void setAutoOff(String autoOff) {
        this.autoOff = autoOff;
    }

    public String getAntiDrop() {
        return antiDrop;
    }

    public void setAntiDrop(String antiDrop) {
        this.antiDrop = antiDrop;
    }

    public String getAntiScale() {
        return antiScale;
    }

    public void setAntiScale(String antiScale) {
        this.antiScale = antiScale;
    }

    public String getWirelessUse() {
        return wirelessUse;
    }

    public void setWirelessUse(String wirelessUse) {
        this.wirelessUse = wirelessUse;
    }

    public String getCleaningSystem() {
        return cleaningSystem;
    }

    public void setCleaningSystem(String cleaningSystem) {
        this.cleaningSystem = cleaningSystem;
    }

    public String getButtonPlace() {
        return buttonPlace;
    }

    public void setButtonPlace(String buttonPlace) {
        this.buttonPlace = buttonPlace;
    }

    public String getCircleCordMounting() {
        return circleCordMounting;
    }

    public void setCircleCordMounting(String circleCordMounting) {
        this.circleCordMounting = circleCordMounting;
    }

    public double getCordLenght() {
        return cordLenght;
    }

    public void setCordLenght(double cordLenght) {
        this.cordLenght = cordLenght;
    }

    public String getComplectation() {
        return complectation;
    }

    public void setComplectation(String complectation) {
        this.complectation = complectation;
    }

    public String getDopInfo() {
        return dopInfo;
    }

    public void setDopInfo(String dopInfo) {
        this.dopInfo = dopInfo;
    }

    @Override
    public String toString() {
        return "Characteristic{" +
                "type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", mainColor='" + mainColor + '\'' +
                ", dopColor='" + dopColor + '\'' +
                ", isTravel='" + isTravel + '\'' +
                ", energy='" + energy + '\'' +
                ", materialOfUnderside='" + materialOfUnderside + '\'' +
                ", steamStrike='" + steamStrike + '\'' +
                ", sprayFunction='" + sprayFunction + '\'' +
                ", autoOff='" + autoOff + '\'' +
                ", antiDrop='" + antiDrop + '\'' +
                ", antiScale='" + antiScale + '\'' +
                ", wirelessUse='" + wirelessUse + '\'' +
                ", cleaningSystem='" + cleaningSystem + '\'' +
                ", buttonPlace='" + buttonPlace + '\'' +
                ", circleCordMounting='" + circleCordMounting + '\'' +
                ", cordLenght=" + cordLenght +
                ", complectation='" + complectation + '\'' +
                ", dopInfo='" + dopInfo + '\'' +
                '}';
    }
}
