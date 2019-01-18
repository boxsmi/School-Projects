/* Created by Aleksandr 
                       Smirnov
                                */
package lesson14;

public class Person {
    private String name;
    private int age;

    public void setAge(int age) throws CurrentAgeException {
        if (age < 0 || age > 105) {
            throw new CurrentAgeException("Возраст не верный. Не меньше 0 и не более 105");
        }
        this.age = age;
    }
}