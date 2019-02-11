/* Created by Aleksandr 
                       Smirnov
                                */
package lesson19;

import Interfaces.MultiMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        MultiMap<Buyer,Product> checks = new MiltiMapImpl<>();

        Buyer ivan = new Buyer("Ivan", "+73464643646");
        Buyer dima = new Buyer("Dima", "+73464642342");
        Buyer petya = new Buyer("Petya", "+73464643232");

        Product moloko = new Product(1,"Moloko",69);
        Product hleb = new Product(2,"Hleb",30);
        Product semki = new Product(3,"Semki",12);
        Product pivo = new Product(4,"Pivo",44);
        Product gin = new Product(5,"Gin",60);
        Product vodka = new Product(6,"Vodka",34);
        Product sirop = new Product(7,"Sirop",76);
        Product sosiski = new Product(8,"Sosiski",23);
        Product ikra = new Product(9,"Ikra",11);
        Product kasha = new Product(10,"Kasha",8);

        checks.put(ivan,moloko);
        checks.put(ivan,moloko);
        checks.put(ivan,moloko);
        checks.put(ivan,moloko);
        checks.put(ivan,moloko);
//        checks.put(ivan,vodka);
//        checks.put(ivan,sirop);

        checks.put(dima,sirop);
        checks.put(dima,sirop);
        checks.put(dima,sirop);
//        checks.put(dima,semki);
//        checks.put(dima,vodka);
//        checks.put(dima,ikra);
//        checks.put(dima,kasha);

//        checks.put(petya,moloko);
//        checks.put(petya,hleb);
//        checks.put(petya,semki);
//        checks.put(petya,ikra);
//        checks.put(petya,gin);
//        checks.put(petya,vodka);
//        checks.put(petya,sosiski);
        checks.put(petya,pivo);
        checks.put(petya,pivo);
        checks.put(petya,pivo);
        checks.put(petya,pivo);
        checks.put(petya,pivo);

        System.out.println(checks.size());
        System.out.println(checks.countValues(petya));
        System.out.println("--------------");
        for(Iterator<Product> productIterator = checks.valuesIterator(petya); productIterator.hasNext();)
        {
            System.out.println(productIterator.next());
        }
        System.out.println("--------------");
        Collection<Product> products = checks.values();
        for(Product product:products){
            System.out.println(product);
        }
        System.out.println("--------------");

        MultiMap<Buyer,Product> check2 = new MiltiMapImpl<>();

        check2.put(petya,moloko);
        check2.put(petya,hleb);
        check2.put(petya,semki);
        check2.put(petya,ikra);
        check2.put(petya,gin);
        check2.put(petya,vodka);

        check2.putAll(checks);

        Collection<Product> products2 = check2.values();
        for(Product temp : products2){
            System.out.println(temp);
        }

        System.out.println(check2.containsKey(dima));
        System.out.println(check2.containsValue(sirop));
        System.out.println(check2.get(petya));
    }
}
