/* Created by Aleksandr 
                       Smirnov
                                */
package lesson11;

public abstract class Animal implements IZooAnimal{
    private int age;
    private int cost;
    private String name;

    public Animal(){}

    public int getAge(){
        return this.age;
    }

    public int getCost(){
        return this.cost;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setCost(int cost){
        this.cost=cost;
    }

    public void setName(String name){
        this.name=name;
    }

}
