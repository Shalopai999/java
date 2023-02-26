package org.example.seminar3.hw1;

import java.util.ArrayList;
import java.util.List;

public class hw1 {
    public static void main(String[] args) {
        Items1 items = new Items1("высший", 25, 1);
        Items1 items1 = new Items1("средний", 10, 2);
        Items1 items2 = new Items1("высший", 120, 2);
        Items1 items3 = new Items1("средний", 35, 3);
        Items1 items4 = new Items1("средний", 15, 2);

        List<Items1> itemsList = new ArrayList<>();
        itemsList.add(items);
        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);
        itemsList.add(items4);
        String searchName = "высший";
        Integer priceMax = 0;
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < itemsList.size(); i++) {
            if ((itemsList.get(i).getSort().equals(1) || itemsList.get(i).getSort().equals(2)) & itemsList.get(i).getName().equals(searchName)) {
                prices.add(itemsList.get(i).getPrice());
            }
        }
        for (int i = 0; i < prices.size(); i++) {
            if (prices.get(i) > priceMax) {
                priceMax = prices.get(i);
            }
        }
        System.out.println("Наибольшая цена равна: " + priceMax);
    }
}
