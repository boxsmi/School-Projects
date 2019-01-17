/*
Created by Aleksandr
                    Smirnov*/
package dns;

public class Comments {
    private String commentToProduct;
    private String dateOfComment;

    public Comments() {
    }

    public Comments(String commentToProduct, String dateOfComment) {
        this.commentToProduct = commentToProduct;
        this.dateOfComment = dateOfComment;
    }

    public String getCommentToProduct() {
        return commentToProduct;
    }

    public void setCommentToProduct(String commentToProduct) {
        this.commentToProduct = commentToProduct;
    }

    public String getDateOfComment() {
        return dateOfComment;
    }

    public void setDateOfComment(String dateOfComment) {
        this.dateOfComment = dateOfComment;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "commentToProduct='" + commentToProduct + '\'' +
                ", dateOfComment='" + dateOfComment + '\'' +
                '}';
    }
}
