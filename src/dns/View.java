/*
Created by Aleksandr
                    Smirnov*/
package dns;

import java.util.Arrays;
import java.util.Date;

public class View {

    private String plus;
    private String minuse;
    private String comment;
    private Photo[] photoView = new Photo[10];
    private String periodOfUse;
    private int mark;
    private int like;
    private Date dateOfView;
    private String citiOfBuy;
    private Buyer buyer;

    public View() {
    }

    public View(String plus, String minuse, String comment, Photo[] photoView) {
        this.plus = plus;
        this.minuse = minuse;
        this.comment = comment;
        this.photoView = photoView;
    }

    public String getPlus() {
        return plus;
    }

    public void setPlus(String plus) {
        this.plus = plus;
    }

    public String getMinuse() {
        return minuse;
    }

    public void setMinuse(String minuse) {
        this.minuse = minuse;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Photo[] getPhotoView() {
        return photoView;
    }

    public void setPhotoView(Photo[] photoView) {
        this.photoView = photoView;
    }

    @Override
    public String toString() {
        return "View{" +
                "plus='" + plus + '\'' +
                ", minuse='" + minuse + '\'' +
                ", comment='" + comment + '\'' +
                ", photoView=" + Arrays.toString(photoView) +
                '}';
    }
}
