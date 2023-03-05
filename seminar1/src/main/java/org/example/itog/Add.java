package org.example.itog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Add {
    static List<Items> itemsList = new ArrayList<>();

    public static List<Items> abc() {
        boolean isRun = true;
        while (isRun) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название ноутбука:");
            Items n = new Items();
            n.name = scanner.nextLine();

            System.out.println("Введите объем ОЗУ:");
            Items r = new Items();
            r.ram = scanner.nextInt();

            System.out.println("Введите объем HDD:");
            Items h = new Items();
            h.hdd = scanner.nextInt();

            System.out.println("Введите операционную систему:");
            Items o = new Items();
            o.os = scanner.nextLine();
            o.os = scanner.nextLine();

            System.out.println("Введите цвет ноутбука:");
            Items c = new Items();
            c.color = scanner.nextLine();

            Items item = new Items();
            item.setName(n.name);
            item.setRam(r.ram);
            item.setHdd(h.hdd);
            item.setOs(o.os);
            item.setColor(c.color);

            itemsList.add(item);

            System.out.println("Еще добавить ноутбук? y/n");
            String s = scanner.nextLine();
            if (!s.contains("y")) {
                isRun = false;
            }
        }
        return itemsList;

    }
}
