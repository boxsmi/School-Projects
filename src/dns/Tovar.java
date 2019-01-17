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
    private Photo littlePhoto;
    private Photo bigPhoto;
    private About aboutProduct;
    private String countryOfMade;
    private String guarantee;
    private Photo[] dopPhoto = new Photo[10];
    private Video [] dopVideo = new Video[10];
    private Characteristic [] characteristic = new Characteristic[30];
    private View [] view = new View[1000];
    private Comments [] comments = new Comments [1000];
    private Review [] review = new Review[1000];
    private QuestionAndAnswers [] questionAndAnswers = new QuestionAndAnswers[1000];
    private Drivers [] files = new Drivers[10];
    private Tovar[] accesories = new Tovar[10];
    private Shop [] shops = new Shop[50];

    public Tovar() {
    }

    public Tovar(String mainName, String kodTovara, int lastPrice, int currentPrice, Photo littlePhoto, Photo bigPhoto, About aboutProduct, String countryOfMade, String guarantee, Photo[] dopPhoto, Video[] dopVideo, Characteristic[] characteristic, View[] view, Comments[] comments, Review[] review, QuestionAndAnswers[] questionAndAnswers, Drivers[] files, Tovar[] accesories, Shop[] shops) {
        this.mainName = mainName;
        this.kodTovara = kodTovara;
        this.lastPrice = lastPrice;
        this.currentPrice = currentPrice;
        this.littlePhoto = littlePhoto;
        this.bigPhoto = bigPhoto;
        this.aboutProduct = aboutProduct;
        this.countryOfMade = countryOfMade;
        this.guarantee = guarantee;
        this.dopPhoto = dopPhoto;
        this.dopVideo = dopVideo;
        this.characteristic = characteristic;
        this.view = view;
        this.comments = comments;
        this.review = review;
        this.questionAndAnswers = questionAndAnswers;
        this.files = files;
        this.accesories = accesories;
        this.shops = shops;
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

    public About getAboutProduct() {
        return aboutProduct;
    }

    public void setAboutProduct(About aboutProduct) {
        this.aboutProduct = aboutProduct;
    }

    public String getCountryOfMade() {
        return countryOfMade;
    }

    public void setCountryOfMade(String countryOfMade) {
        this.countryOfMade = countryOfMade;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    public Photo[] getDopPhoto() {
        return dopPhoto;
    }


    public Video[] getDopVideo() {
        return dopVideo;
    }

    public void setDopVideo(Video[] dopVideo) {
        this.dopVideo = dopVideo;
    }

    public Characteristic[] getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(Characteristic[] characteristic) {
        this.characteristic = characteristic;
    }

    public View[] getView() {
        return view;
    }

    public void setView(View[] view) {
        this.view = view;
    }

    public Comments[] getComments() {
        return comments;
    }

    public void setComments(Comments[] comments) {
        this.comments = comments;
    }

    public Review[] getReview() {
        return review;
    }

    public void setReview(Review[] review) {
        this.review = review;
    }

    public QuestionAndAnswers[] getQuestionAndAnswers() {
        return questionAndAnswers;
    }

    public void setQuestionAndAnswers(QuestionAndAnswers[] questionAndAnswers) {
        this.questionAndAnswers = questionAndAnswers;
    }

    public Drivers[] getFiles() {
        return files;
    }

    public void setFiles(Drivers[] files) {
        this.files = files;
    }

    public Tovar[] getAccesories() {
        return accesories;
    }

    public void setAccesories(Tovar[] accesories) {
        this.accesories = accesories;
    }

    public Shop[] getShops() {
        return shops;
    }

    public void setShops(Shop[] shops) {
        this.shops = shops;
    }

    public void addFototoDopPhotos(Photo photoToAdd) {
        for (int i = 0; i < dopPhoto.length; i++) {
            if (dopPhoto[i] == null)
                dopPhoto[i] = photoToAdd;
            break;
        }
    }


}


