/*
Created by Aleksandr
                    Smirnov*/
package dns;

public class Video {

    private String pathToVideo;
    private String titleOfVideo;

    public Video() {
    }

    public Video(String pathToVideo, String titleOfVideo) {
        this.pathToVideo = pathToVideo;
        this.titleOfVideo = titleOfVideo;
    }

    public String getPathToVideo() {
        return pathToVideo;
    }

    public void setPathToVideo(String pathToVideo) {
        this.pathToVideo = pathToVideo;
    }

    public String getTitleOfVideo() {
        return titleOfVideo;
    }

    public void setTitleOfVideo(String titleOfVideo) {
        this.titleOfVideo = titleOfVideo;
    }

    @Override
    public String toString() {
        return "Video{" +
                "pathToVideo='" + pathToVideo + '\'' +
                ", titleOfVideo='" + titleOfVideo + '\'' +
                '}';
    }
}
