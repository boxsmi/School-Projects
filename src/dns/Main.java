/*
Created by Aleksandr
                    Smirnov*/
package dns;

public class Main {
    public static void main(String[] args) {
        Photo photo0 = new Photo("https://c.dns-shop.ru/thumb/st1/fit/wm/800/650/ed03766603bd40e29f1b6eb94e202341/51cf22a4ea3fb8e30feecee56ad05f407c23dc5b791582350b0974fa50ddc38c.jpg", "Утюг DEXP SW-107 голубой");
        Photo photo1 = new Photo("https://c.dns-shop.ru/thumb/st1/fit/wm/800/650/a94662c82f1f05e48f854d2cb0180c67/828ff989834e4668dba023221ccd458bbd48687345e35d35c81b5ca5b4296a25.jpg", "Утюг DEXP SW-107 голубой");
        Photo photo2 = new Photo("https://c.dns-shop.ru/thumb/st1/fit/wm/800/650/fed56e9891872b344ed15a639c350891/4ce61697e73e88c26710c71188f6a4cb5fcc1724c643f413f5ff2a509ed3ba63.jpg", "Утюг DEXP SW-107 голубой");
        Photo[] dopPhoto = new Photo[]{photo1, photo2};
        About about = new About("Утюг DEXP SW-107 голубой отличают компактные размеры и вес, равный всего 0.9 кг, " +
                "так что он не утомит держащую его руку даже при длительном непрерывном использовании. " +
                "Его небольшой пластиковый корпус оформлен в белых и голубых тонах, резервуар сделан прозрачным для контроля " +
                "за уровнем воды. Для деликатного глажения предусмотрены системы разбрызгивания воды и парового удара.\n" +
                "Абсолютно гладкая подошва DEXP SW-107 выполнена из нержавеющей стали, она скользит по ткани, не повреждая " +
                "ее. Сетевой шнур утюга крепится при помощи шаровой установки и имеет достаточную длину в 1.8 м. " +
                "Вы не пожалеете, выбрав такой симпатичный и надежный утюг для дома.");
        Comments comments = new Comments("Чек должны были выдать обязательно.", "19 июля 2018 г. 08:19");
        Drivers files = new Drivers("Инструкция: DEXP SW-107", "http://ftp.dexp.club/Files/Products/21791.pdf");
        QuestionAndAnswers question = new QuestionAndAnswers("Габариты", "Какие у него размеры? Или хотя бы ширина подошвы и длина утюга?", "Вероника");
        Review review = new Review("Нет обзоров.");
        Video video = new Video("https://youtu.be/sYsLgUu9ERg", "Утюг DEXP SW-107 голубой");
        View view = new View("Обычный чайник, кипятит воду.", "из недостатков, когда мало воды. то она льется через крышку, от крышки долго пахнет платиком, но вода после нескольких кипячений нормальная", "По факту подсветка белая, просто стекло зеленого светы, с голубой подсветкой и белым стеклом, выглядят лучше чайники", dopPhoto);
        Characteristic characteristica = new Characteristic("утюг", "DEXP SW-107", "голубой", "белый", "нет", "1200 Вт", "нержавеющая сталь",
                "есть", "есть", "нет", "нет", "нет", "нет", "нет", "есть", "есть", 1.8, "документация, мерный стакан", "регулировка температуры, прорезиненная ручка, регулируемая подача пара, 4 температурных режима");
        Tovar utyug = new Tovar();
        utyug.setMainName("Утюг DEXP SW-107 голубой");
        utyug.setKodTovara("1041363");
        utyug.setLastPrice(750);
        utyug.setCurrentPrice(450);
        utyug.setMark(4.5);
        utyug.setVoices(24);
        utyug.setAvailability(true);
        utyug.setDopInfo("Гарантия АСЦ:12 мес.\n" +
                "\n" +
                "Страна-производитель:Китай");
        utyug.setDopGuarantee("1 год");
        utyug.setLittlePhoto(photo0);
        utyug.setBigPhoto(photo1);
        utyug.addFototoDopPhotos(photo1);
        utyug.addFototoDopPhotos(photo2);
        utyug.addFototoDopPhotos(photo0);
        utyug.setVideoTovara(video);
        utyug.setAboutProduct(about);
        utyug.setCharacteristic(characteristica);
        utyug.setView(view);
        utyug.setComments(comments);
        utyug.setReview(review);
        utyug.setQuestionAndAnswers(question);
        utyug.setFiles(files);

        Tovar utyugOther = new Tovar();
        utyugOther.setMainName("Утюг DEXP SW-307 черный");
        utyugOther.setKodTovara("1041363");
        utyugOther.setLastPrice(900);
        utyugOther.setCurrentPrice(580);
        utyugOther.setMark(4.8);
        utyugOther.setVoices(13);
        utyugOther.setAvailability(true);
        utyugOther.setDopInfo("Гарантия АСЦ:12 мес.\n" +
                "\n" +
                "Страна-производитель:Китай");
        utyugOther.setDopGuarantee("1 год");
        utyugOther.setLittlePhoto(photo0);
        utyugOther.setBigPhoto(photo1);
        utyugOther.addFototoDopPhotos(photo1);
        utyugOther.addFototoDopPhotos(photo2);
        utyugOther.addFototoDopPhotos(photo0);
        utyugOther.setVideoTovara(video);
        utyugOther.setAboutProduct(about);
        utyugOther.setCharacteristic(characteristica);
        utyugOther.setView(view);
        utyugOther.setComments(comments);
        utyugOther.setReview(review);
        utyugOther.setQuestionAndAnswers(question);
        utyugOther.setFiles(files);

        System.out.println(utyug);
        System.out.println(utyugOther);

        TovarFilter.printBestTovarByRating(utyug, utyugOther);
    }
}


