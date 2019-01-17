/* Created by Aleksandr 
                       Smirnov
                                */
package lesson12;

public class Kharakteristika {

    String size;
    private double diametr;
    private double obiem;
    private String matherial;
    private double ves;
    private String primenenie;

    public Kharakteristika() {
    }

    public Kharakteristika(double diametr, double obiem, String matherial, double ves, String size) {
        this.diametr = diametr;
        this.obiem = obiem;
        this.matherial = matherial;
        this.ves = ves;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public double getObiem() {
        return obiem;
    }

    public void setObiem(double obiem) {
        this.obiem = obiem;
    }

    public String getMatherial() {
        return matherial;
    }

    public void setMatherial(String matherial) {
        this.matherial = matherial;
    }

    public double getVes() {
        return ves;
    }

    public void setVes(double ves) {
        this.ves = ves;
    }

    public String getPrimenenie() {
        return primenenie;
    }

    public void setPrimenenie(String primenenie) {
        this.primenenie = primenenie;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Kharakteristika{" +
                "diametr=" + diametr +
                ", obiem=" + obiem +
                ", matherial='" + matherial + '\'' +
                ", ves=" + ves +
                ", primenenie='" + primenenie + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
