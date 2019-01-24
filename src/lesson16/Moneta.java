/* Created by Aleksandr 
                       Smirnov
                                */
package lesson16;

import java.util.Objects;

public class Moneta implements Comparable<Moneta> {
    private int nominal;
    private int god;
    private int numberOfStars;
    private String material;

    public Moneta() {
    }

    public Moneta(int nominal, int god, int numberOfStars, String material) {
        this.nominal = nominal;
        this.god = god;
        this.numberOfStars = numberOfStars;
        this.material = material;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getGod() {
        return god;
    }

    public void setGod(int god) {
        this.god = god;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Moneta{" +
                "nominal=" + nominal +
                ", god=" + god +
                ", numberOfStars=" + numberOfStars +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moneta moneta = (Moneta) o;
        return nominal == moneta.nominal &&
                god == moneta.god &&
                numberOfStars == moneta.numberOfStars &&
                Objects.equals(material, moneta.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominal, god, numberOfStars, material);
    }

    @Override
    public int compareTo(Moneta o) {
        int year1 = this.getGod();
        int year2 = o.getGod();
        if (year1 != year2)
            return year1 - year2;

        int nominal1 = this.getNominal();
        int nominal2 = o.getNominal();
        if (nominal1 != nominal2)
            return nominal1 - nominal2;

        int stars1 = this.getNumberOfStars();
        int stars2 =o.getNumberOfStars();
        if (stars1!=stars2)
            return stars1-stars2;



        return this.getMaterial().compareTo(o.getMaterial());
    }

}
