package org.example.seminar1;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingHotDrinks implements Vending {
    private List<HotDrinks> hotDrinksList;

    public VendingHotDrinks() {
        this.hotDrinksList = new ArrayList<>();
    }

    public void addHotDrinks(HotDrinks hotDrinks) {
        hotDrinksList.add(hotDrinks);
    }

    public List<HotDrinks> getHotDrinksList() {
        return hotDrinksList;
    }

    @Override
    public void money() {
        System.out.println("insert money");
    }

    @Override
    public void work() {
        System.out.println("work");
    }

    @Override
    public void endWork() {
        System.out.println("end work");
    }

    public void saleHotDrinks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter hot drink");
        for (HotDrinks hotDrink2 : hotDrinksList) {
            System.out.print(hotDrink2.getName() + "  ");
        }
        System.out.print("\nenter: ");
        String inputHotDrink = scanner.nextLine();
        for (HotDrinks hotDrink : hotDrinksList) {
            if (hotDrink.getName().equals(inputHotDrink)) {
                System.out.println("insert money.\nprice: " + hotDrink.getPrice());
                System.out.print("insert money: ");
                String enterMoney = scanner.nextLine();
                int intMoney = Integer.parseInt(enterMoney);
                if (intMoney >= hotDrink.getPrice()) {
                    money();
                    work();
                    System.out.println(hotDrink);
                    int change = intMoney - hotDrink.getPrice();
                    endWork();
                    System.out.println("change = " + change);
                } else {
                    money();
                    System.out.println("no money");
                }

            }

        }

    }

}
