/* Created by Aleksandr 
                       Smirnov
                                */
package lesson12;

import java.util.Arrays;

public class Tovar {
    private String mainName;
    private String articul;
    private int price;
    private Kharakteristika kharakteristika;
    private Photo shortPhoto;
    private Photo[] dopPhoto = new Photo[10];
    private String mainInfo;
    private Tovar[] recomendTovary = new Tovar[10];

    public Tovar() {
    }

    public Tovar(String mainName, String articul, int price, Kharakteristika kharakteristika, Photo shortPhoto,
                 Photo[] dopPhoto, String mainInfo, Tovar[] recomendTovary) {
        this.mainName = mainName;
        this.articul = articul;
        this.price = price;
        this.kharakteristika = kharakteristika;
        this.shortPhoto = shortPhoto;
        this.dopPhoto = dopPhoto;
        this.mainInfo = mainInfo;
        this.recomendTovary = recomendTovary;
    }

    public String getMainName() {
        return mainName;
    }

    public void setMainName(String mainName) {
        this.mainName = mainName;
    }

    public String getArticul() {
        return articul;
    }

    public void setArticul(String articul) {
        this.articul = articul;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Kharakteristika getKharakteristika() {
        return kharakteristika;
    }

    public void setKharakteristika(Kharakteristika kharakteristika) {
        this.kharakteristika = kharakteristika;
    }

    public Photo getShortPhoto() {
        return shortPhoto;
    }

    public void setShortPhoto(Photo shortPhoto) {
        this.shortPhoto = shortPhoto;
    }

    public Photo[] getDopPhoto() {
        return dopPhoto;
    }

    public void addFototoDopPhotos(Photo photoToAdd) {
        for (int i = 0; i < dopPhoto.length; i++) {
            if (dopPhoto[i] == null)
                dopPhoto[i] = photoToAdd;
            break;
        }
    }

    public String getMainInfo() {
        return mainInfo;
    }

    public void setMainInfo(String mainInfo) {
        this.mainInfo = mainInfo;
    }

    public Tovar[] getRecomendTovary() {
        return recomendTovary;
    }

    public void setRecomendTovary(Tovar[] recomendTovary) {
        this.recomendTovary = recomendTovary;
    }


    @Override
    public String toString() {
        return "Tovar{" +
                "mainName='" + mainName + '\'' +
                ", articul='" + articul + '\'' +
                ", price=" + price +
                ", kharakteristika=" + kharakteristika +
                ", shortPhoto=" + shortPhoto +
                ", dopPhoto=" + Arrays.toString(dopPhoto) +
                ", mainInfo='" + mainInfo + '\'' +
                ", recomendTovary=" + Arrays.toString(recomendTovary) +
                '}';
    }
}
