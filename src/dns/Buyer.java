/*
Created by Aleksandr
                    Smirnov*/
package dns;

import java.util.Date;

public class Buyer {

    private String name;
    private Photo avatar;
    private Date dateOfRegistration;
    private String city;
    private Comments[] comments;
    private View[] views;
    private QuestionAndAnswers[] questionAndAnswers;
    private int likes;

    public Buyer() {
    }

    public Buyer(String name, Photo avatar, Date dateOfRegistration, String city, Comments[] comments, View[] views, QuestionAndAnswers[] questionAndAnswers, int likes) {
        this.name = name;
        this.avatar = avatar;
        this.dateOfRegistration = dateOfRegistration;
        this.city = city;
        this.comments = comments;
        this.views = views;
        this.questionAndAnswers = questionAndAnswers;
        this.likes = likes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Photo getAvatar() {
        return avatar;
    }

    public void setAvatar(Photo avatar) {
        this.avatar = avatar;
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Comments[] getComments() {
        return comments;
    }

    public void setComments(Comments[] comments) {
        this.comments = comments;
    }

    public View[] getViews() {
        return views;
    }

    public void setViews(View[] views) {
        this.views = views;
    }

    public QuestionAndAnswers[] getQuestionAndAnswers() {
        return questionAndAnswers;
    }

    public void setQuestionAndAnswers(QuestionAndAnswers[] questionAndAnswers) {
        this.questionAndAnswers = questionAndAnswers;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
