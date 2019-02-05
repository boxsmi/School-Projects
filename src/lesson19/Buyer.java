/* Created by Aleksandr 
                       Smirnov
                                */
package lesson19;

import java.util.Objects;

public class Buyer {

    private String name;
    private String numberTelephone;

    public Buyer(String name, String numberTelephone) {
        this.name = name;
        this.numberTelephone = numberTelephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberTelephone() {
        return numberTelephone;
    }

    public void setNumberTelephone(String numberTelephone) {
        this.numberTelephone = numberTelephone;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                ", numberTelephon='" + numberTelephone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Buyer buyer = (Buyer) o;
        return Objects.equals(name, buyer.name) &&
                Objects.equals(numberTelephone, buyer.numberTelephone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberTelephone);
    }
}
