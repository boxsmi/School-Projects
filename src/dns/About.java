/*
Created by Aleksandr
                    Smirnov*/
package dns;
public class About {
    private String infoAboutProduct;

    About() {
    }

    About(String infoAboutProduct) {
        this.infoAboutProduct = infoAboutProduct;
    }

    public String getInfoAboutProduct() {
        return infoAboutProduct;
    }

    public void setInfoAboutProduct(String infoAboutProduct) {
        this.infoAboutProduct = infoAboutProduct;
    }

    @Override
    public String toString() {
        return "About{" +
                "infoAboutProduct='" + infoAboutProduct + '\'' +
                '}';
    }
}
