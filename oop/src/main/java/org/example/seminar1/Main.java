package org.example.seminar1;

public class Main {
    public static void main(String[] args) {
        HotDrinks tea = new  HotDrinks("tea", 0.3, 50, false, 70);
        HotDrinks coffee = new  HotDrinks("coffee", 0.3, 100, true, 60);
        HotDrinks capuchino = new  HotDrinks("capuchino", 0.5, 150, true, 50);
        VendingHotDrinks hotDrVenMach = new VendingHotDrinks();
        hotDrVenMach.addHotDrinks(tea);
        hotDrVenMach.addHotDrinks(coffee);
        hotDrVenMach.addHotDrinks(capuchino);

        System.out.println(hotDrVenMach.getHotDrinksList());

        hotDrVenMach.saleHotDrinks();
    }
}
