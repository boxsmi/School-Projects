/*
Created by Aleksandr
                    Smirnov*/
package dns;

import javax.xml.crypto.Data;
import java.util.Date;

public class Comments {
    private String commentToProduct;
    private Date dateOfComment;
    private Buyer authorOfComment;
    private int like;

    public Comments() {
    }

    public Comments(String commentToProduct, Date dateOfComment, Buyer authorOfComment, int like) {
        this.commentToProduct = commentToProduct;
        this.dateOfComment = dateOfComment;
        this.authorOfComment = authorOfComment;
        this.like = like;
    }

    public String getCommentToProduct() {
        return commentToProduct;
    }

    public void setCommentToProduct(String commentToProduct) {
        this.commentToProduct = commentToProduct;
    }

    public Date getDateOfComment() {
        return dateOfComment;
    }

    public void setDateOfComment(Date dateOfComment) {
        this.dateOfComment = dateOfComment;
    }

    public Buyer getAuthorOfComment() {
        return authorOfComment;
    }

    public void setAuthorOfComment(Buyer authorOfComment) {
        this.authorOfComment = authorOfComment;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

}
