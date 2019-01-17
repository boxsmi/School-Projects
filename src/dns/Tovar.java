/*
Created by Aleksandr
                    Smirnov*/
package dns;

import java.util.Arrays;

public class Tovar {

    private String mainName;
    private String kodTovara;
    private int lastPrice;
    private int currentPrice;
    private double mark;
    private double voices;
    private boolean availability;
    private String dopInfo;
    private String dopGuarantee;
    private Photo littlePhoto;
    private Photo bigPhoto;
    private Photo[] dopPhoto = new Photo[10];
    private Video videoTovara;
    private About aboutProduct;
    private Characteristic characteristic;
    private View view;
    private Comments comments;
    private Review review;
    private QuestionAndAnswers questionAndAnswers;
    private Drivers files;
    private Tovar[] accesories = new Tovar[10];

    public Tovar() {
    }

    public Tovar(String mainName, String kodTovara, int lastPrice, int currentPrice, double mark, double voices,
                 boolean availability, String dopInfo, String dopGuarantee, Photo littlePhoto, Photo bigPhoto,
                 Photo[] dopPhoto, Video videoTovara, About aboutProduct, Characteristic characteristic,
                 View view, Comments comments, Review review, QuestionAndAnswers questionAndAnswers,
                 Drivers files, Tovar[] accesories) {
        this.mainName = mainName;
        this.kodTovara = kodTovara;
        this.lastPrice = lastPrice;
        this.currentPrice = currentPrice;
        this.mark = mark;
        this.voices = voices;
        this.availability = availability;
        this.dopInfo = dopInfo;
        this.dopGuarantee = dopGuarantee;
        this.littlePhoto = littlePhoto;
        this.bigPhoto = bigPhoto;
        this.dopPhoto = dopPhoto;
        this.videoTovara = videoTovara;
        this.aboutProduct = aboutProduct;
        this.characteristic = characteristic;
        this.view = view;
        this.comments = comments;
        this.review = review;
        this.questionAndAnswers = questionAndAnswers;
        this.files = files;
        this.accesories = accesories;
    }

    public String getMainName() {
        return mainName;
    }

    public void setMainName(String mainName) {
        this.mainName = mainName;
    }

    public String getKodTovara() {
        return kodTovara;
    }

    public void setKodTovara(String kodTovara) {
        this.kodTovara = kodTovara;
    }

    public int getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(int lastPrice) {
        this.lastPrice = lastPrice;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public double getVoices() {
        return voices;
    }

    public void setVoices(double voices) {
        this.voices = voices;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getDopInfo() {
        return dopInfo;
    }

    public void setDopInfo(String dopInfo) {
        this.dopInfo = dopInfo;
    }

    public String getDopGuarantee() {
        return dopGuarantee;
    }

    public void setDopGuarantee(String dopGuarantee) {
        this.dopGuarantee = dopGuarantee;
    }

    public Photo getLittlePhoto() {
        return littlePhoto;
    }

    public void setLittlePhoto(Photo littlePhoto) {
        this.littlePhoto = littlePhoto;
    }

    public Photo getBigPhoto() {
        return bigPhoto;
    }

    public void setBigPhoto(Photo bigPhoto) {
        this.bigPhoto = bigPhoto;
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

    public Video getVideoTovara() {
        return videoTovara;
    }

    public void setVideoTovara(Video videoTovara) {
        this.videoTovara = videoTovara;
    }

    public About getAboutProduct() {
        return aboutProduct;
    }

    public void setAboutProduct(About aboutProduct) {
        this.aboutProduct = aboutProduct;
    }

    public Characteristic getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(Characteristic characteristic) {
        this.characteristic = characteristic;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public Comments getComments() {
        return comments;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public QuestionAndAnswers getQuestionAndAnswers() {
        return questionAndAnswers;
    }

    public void setQuestionAndAnswers(QuestionAndAnswers questionAndAnswers) {
        this.questionAndAnswers = questionAndAnswers;
    }

    public Drivers getFiles() {
        return files;
    }

    public void setFiles(Drivers files) {
        this.files = files;
    }

    public Tovar[] getAccesories() {
        return accesories;
    }

    public void setAccesories(Tovar[] accesories) {
        this.accesories = accesories;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "mainName='" + mainName + '\'' +
                ", kodTovara='" + kodTovara + '\'' +
                ", lastPrice=" + lastPrice +
                ", currentPrice=" + currentPrice +
                ", mark=" + mark +
                ", voices=" + voices +
                ", availability=" + availability +
                ", dopInfo='" + dopInfo + '\'' +
                ", dopGuarantee='" + dopGuarantee + '\'' +
                ", littlePhoto=" + littlePhoto +
                ", bigPhoto=" + bigPhoto +
                ", dopPhoto=" + Arrays.toString(dopPhoto) +
                ", videoTovara=" + videoTovara +
                ", aboutProduct=" + aboutProduct +
                ", characteristic=" + characteristic +
                ", view=" + view +
                ", comments=" + comments +
                ", review=" + review +
                ", questionAndAnswers=" + questionAndAnswers +
                ", files=" + files +
                '}';
    }
}


