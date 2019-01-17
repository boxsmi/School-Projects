/*
Created by Aleksandr
                    Smirnov*/
package dns;


public class Shop {

    private String name;
    private String adress;
    private String orientir;
    private String workingHours;
    private String obratnayaSvyaz;
    private String[] sposobPokupki;
    private String[] sposobOplati;
    private String[] sposobDostavki;
    private String[] kredit;
    private Photo[] shopPhoto = new Photo[10];
    //private KartaYandex; карта расположения
    private String direktor;
    private String direktorTel;
    private String direktorEmail;
    private String rekvizitNazvanie;
    private String rekvizitInn;
    private String rekvizitKpp;
    private String rekvizitOgrn;
    private String rekvizitPochtAdress;
    private String rekvizitYurAdress;

    public Shop() {
    }

    public Shop(String name, String adress, String orientir, String workingHours, String obratnayaSvyaz, String[] sposobPokupki, String[] sposobOplati, String[] sposobDostavki, String[] kredit, Photo[] shopPhoto, String direktor, String direktorTel, String direktorEmail, String rekvizitNazvanie, String rekvizitInn, String rekvizitKpp, String rekvizitOgrn, String rekvizitPochtAdress, String rekvizitYurAdress) {
        this.name = name;
        this.adress = adress;
        this.orientir = orientir;
        this.workingHours = workingHours;
        this.obratnayaSvyaz = obratnayaSvyaz;
        this.sposobPokupki = sposobPokupki;
        this.sposobOplati = sposobOplati;
        this.sposobDostavki = sposobDostavki;
        this.kredit = kredit;
        this.shopPhoto = shopPhoto;
        this.direktor = direktor;
        this.direktorTel = direktorTel;
        this.direktorEmail = direktorEmail;
        this.rekvizitNazvanie = rekvizitNazvanie;
        this.rekvizitInn = rekvizitInn;
        this.rekvizitKpp = rekvizitKpp;
        this.rekvizitOgrn = rekvizitOgrn;
        this.rekvizitPochtAdress = rekvizitPochtAdress;
        this.rekvizitYurAdress = rekvizitYurAdress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getOrientir() {
        return orientir;
    }

    public void setOrientir(String orientir) {
        this.orientir = orientir;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getObratnayaSvyaz() {
        return obratnayaSvyaz;
    }

    public void setObratnayaSvyaz(String obratnayaSvyaz) {
        this.obratnayaSvyaz = obratnayaSvyaz;
    }

    public String[] getSposobPokupki() {
        return sposobPokupki;
    }

    public void setSposobPokupki(String[] sposobPokupki) {
        this.sposobPokupki = sposobPokupki;
    }

    public String[] getSposobOplati() {
        return sposobOplati;
    }

    public void setSposobOplati(String[] sposobOplati) {
        this.sposobOplati = sposobOplati;
    }

    public String[] getSposobDostavki() {
        return sposobDostavki;
    }

    public void setSposobDostavki(String[] sposobDostavki) {
        this.sposobDostavki = sposobDostavki;
    }

    public String[] getKredit() {
        return kredit;
    }

    public void setKredit(String[] kredit) {
        this.kredit = kredit;
    }

    public Photo[] getShopPhoto() {
        return shopPhoto;
    }

    public void setShopPhoto(Photo[] shopPhoto) {
        this.shopPhoto = shopPhoto;
    }

    public String getDirektor() {
        return direktor;
    }

    public void setDirektor(String direktor) {
        this.direktor = direktor;
    }

    public String getDirektorTel() {
        return direktorTel;
    }

    public void setDirektorTel(String direktorTel) {
        this.direktorTel = direktorTel;
    }

    public String getDirektorEmail() {
        return direktorEmail;
    }

    public void setDirektorEmail(String direktorEmail) {
        this.direktorEmail = direktorEmail;
    }

    public String getRekvizitNazvanie() {
        return rekvizitNazvanie;
    }

    public void setRekvizitNazvanie(String rekvizitNazvanie) {
        this.rekvizitNazvanie = rekvizitNazvanie;
    }

    public String getRekvizitInn() {
        return rekvizitInn;
    }

    public void setRekvizitInn(String rekvizitInn) {
        this.rekvizitInn = rekvizitInn;
    }

    public String getRekvizitKpp() {
        return rekvizitKpp;
    }

    public void setRekvizitKpp(String rekvizitKpp) {
        this.rekvizitKpp = rekvizitKpp;
    }

    public String getRekvizitOgrn() {
        return rekvizitOgrn;
    }

    public void setRekvizitOgrn(String rekvizitOgrn) {
        this.rekvizitOgrn = rekvizitOgrn;
    }

    public String getRekvizitPochtAdress() {
        return rekvizitPochtAdress;
    }

    public void setRekvizitPochtAdress(String rekvizitPochtAdress) {
        this.rekvizitPochtAdress = rekvizitPochtAdress;
    }

    public String getRekvizitYurAdress() {
        return rekvizitYurAdress;
    }

    public void setRekvizitYurAdress(String rekvizitYurAdress) {
        this.rekvizitYurAdress = rekvizitYurAdress;
    }
}
