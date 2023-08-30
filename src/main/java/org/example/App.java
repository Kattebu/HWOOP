package org.example;

import org.example.Domen.Bottle;
import org.example.Domen.HotDrinks;
import org.example.Domen.Product;
import org.example.Serveces.CoinDispenser;
import org.example.Serveces.Holder;
import org.example.Serveces.VendingMachine;

import java.util.ArrayList;
import java.util.List;

// Создать наследника Product реализовать класс ГорячийНапиток(Hot Drink) с дополнительным полем int температура.
//Для класса ГорячихНапитков(Hot Drink) написать конструктор и переопределить метод toString()
//В main добавить в автомат несколько ГорячихНапитков(Hot Drink) и воспроизвести логику заложенную в программе
//Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
public class App {
    public static void main(String[] args) throws Exception{
        List<Product> assort = new ArrayList<Product>();

        Product item1 = new Product("Lays", 100);
        Product item2 = new Product("Cola", 50);
        Product item3 = new Bottle("Water", 101, 1.5);
        Product item4 = new HotDrinks("Tea", 55, 56);
        Product item5 = new HotDrinks("Coffee", 60, 57);

        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);
        assort.add(item5);

        Holder hold1 =new Holder(10, 10);
        CoinDispenser disp = new CoinDispenser(120);
        VendingMachine venMach1 = new VendingMachine(hold1, disp, assort);

        for(Product prod: venMach1.getProductList()){
            System.out.println(prod);
        }

    }
}