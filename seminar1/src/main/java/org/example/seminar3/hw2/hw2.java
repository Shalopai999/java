package org.example.seminar3.hw2;

import java.util.ArrayList;
import java.util.List;

public class hw2 {
    public static void main(String[] args) {
        Items2 items = new Items2("tovar1", "qwe", 5, 50, 3);
        Items2 items2 = new Items2("tovar2", "asd", 7, 10, 1);
        Items2 items3 = new Items2("tovar3", "zxc", 3, 110, 3);
        Items2 items4 = new Items2("tovar4", "qwe", 8, 30, 3);
        Items2 items5 = new Items2("tovar5", "asd", 6, 15, 1);

        List<Items2> itemsList = new ArrayList<>();
        itemsList.add(items);
        itemsList.add(items2);
        itemsList.add(items3);
        itemsList.add(items4);
        itemsList.add(items5);
        Integer searchSort = 3;
        List<Items2> sort = new ArrayList<>();
        List<Items2> minPrice = new ArrayList<>();
        for (int i = 0; i < itemsList.size(); i++) {
            if (itemsList.get(i).getSort().equals(searchSort)){
                sort.add(itemsList.get(i));
            }
        }
        minPrice.add(sort.get(0));
        for (int i = 0; i < sort.size(); i++) {
            if (sort.get(i).getPrice() < minPrice.get(0).getPrice()){
                minPrice.set(0, sort.get(i));
            }
        }
        System.out.println("Товар: " + minPrice.get(0).getName()+ " " +"с ценой: " + minPrice.get(0).getPrice());
    }
}
