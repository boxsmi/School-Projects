/*
Created by Aleksandr
                    Smirnov*/
package dns;

public class Photo {

    private String pathToPhoto;
    private String titleOfPhoto;

    public Photo() {
    }

    public Photo(String pathToPhoto, String titleOfPhoto) {
        this.pathToPhoto = pathToPhoto;
        this.titleOfPhoto = titleOfPhoto;
    }

    public String getPathToPhoto() {
        return pathToPhoto;
    }

    public void setPathToPhoto(String pathToPhoto) {
        this.pathToPhoto = pathToPhoto;
    }

    public String getTitleOfPhoto() {
        return titleOfPhoto;
    }

    public void setTitleOfPhoto(String titleOfPhoto) {
        this.titleOfPhoto = titleOfPhoto;
    }


}
