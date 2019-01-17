/* Created by Aleksandr 
                       Smirnov
                                */
package lesson12;

public class Photo {
    private String pathToPhoto;
    private String titlePhoto;

    public Photo() {
    }

    public Photo(String pathToPhoto, String titlePhoto) {
        this.pathToPhoto = pathToPhoto;
        this.titlePhoto = titlePhoto;
    }

    public String getPathToPhoto() {
        return pathToPhoto;
    }

    public void setPathToPhoto(String pathToPhoto) {
        this.pathToPhoto = pathToPhoto;
    }

    public String getTitlePhoto() {
        return titlePhoto;
    }

    public void setTitlePhoto(String titlePhoto) {
        this.titlePhoto = titlePhoto;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "pathToPhoto='" + pathToPhoto + '\'' +
                ", titlePhoto='" + titlePhoto + '\'' +
                '}';
    }
}
