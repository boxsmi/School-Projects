/*
Created by Aleksandr
                    Smirnov*/
package dns;

import java.util.Date;

public class Review {
    private String reviewOfProduct;
    private Buyer pokupatel;
    private Date dateOfReview;
    private Photo[] photoRewiew = new Photo[10];

    public Review() {
    }

    public Review(String reviewOfProduct, Buyer pokupatel, Date dateOfReview, Photo[] photoRewiew) {
        this.reviewOfProduct = reviewOfProduct;
        this.pokupatel = pokupatel;
        this.dateOfReview = dateOfReview;
        this.photoRewiew = photoRewiew;
    }

    public String getReviewOfProduct() {
        return reviewOfProduct;
    }

    public void setReviewOfProduct(String reviewOfProduct) {
        this.reviewOfProduct = reviewOfProduct;
    }

    public Buyer getPokupatel() {
        return pokupatel;
    }

    public void setPokupatel(Buyer pokupatel) {
        this.pokupatel = pokupatel;
    }

    public Date getDateOfReview() {
        return dateOfReview;
    }

    public void setDateOfReview(Date dateOfReview) {
        this.dateOfReview = dateOfReview;
    }

    public Photo[] getPhotoRewiew() {
        return photoRewiew;
    }

    public void setPhotoRewiew(Photo[] photoRewiew) {
        this.photoRewiew = photoRewiew;
    }
}
