/*
Created by Aleksandr
                    Smirnov*/
package dns;

public class Review {
    private String reviewOfProduct;

    public Review() {
    }

    public Review(String reviewOfProduct) {
        this.reviewOfProduct = reviewOfProduct;
    }

    public String getReviewOfProduct() {
        return reviewOfProduct;
    }

    public void setReviewOfProduct(String reviewOfProduct) {
        this.reviewOfProduct = reviewOfProduct;
    }

    @Override
    public String toString() {
        return "Review{" +
                "reviewOfProduct='" + reviewOfProduct + '\'' +
                '}';
    }
}
