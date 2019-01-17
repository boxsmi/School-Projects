package lesson11;

public interface IZooAnimal {

    void voice(); //абстрактный метод. Он public и abstract по-умолчанию

    void run();

    void jump();

    //все методы в интерфейсе public и abstract.
    // Объект интерфейса создать НЕЛЬЗЯ!
    //все переменные в интерфейсах по-умолчанию public static final.
}
