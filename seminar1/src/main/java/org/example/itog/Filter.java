package org.example.itog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Filter {
    public static List<Items> filter() {

        List<Items> itemsList = new ArrayList<>();
        itemsList = Main.getList();
        menu();

        boolean isRun = true;
        while (isRun) {
            Scanner scanner = new Scanner(System.in);
            int q = scanner.nextInt();

            switch (q) {
                case 1:
                    System.out.println("Введите объем памяти от: ");
                    int r1 = scanner.nextInt();
                    System.out.println("Введите объем памяти до: ");
                    int r2 = scanner.nextInt();
                    for (int i = 0; i < itemsList.size(); i++) {
                        if (itemsList.get(i).ram >= r1 && itemsList.get(i).ram <= r2){
                            System.out.println("Название: "+itemsList.get(i).name + ", " + "ОЗУ: " + itemsList.get(i).ram + "Gb, " + "HDD: " + itemsList.get(i).hdd + "Gb, " + "ОС: " + itemsList.get(i).os + ", " + "Цвет: " + itemsList.get(i).color);
                        }
                    }
                    menu();
                    break;
                case 2:
                    System.out.println("два");
                    break;
                case 3:
                    System.out.println("три");
                    break;
                case 4:
                    System.out.println("четыре");
                    break;
                default:
                    isRun = false;
                    System.out.println("Выход");
            }
        }

        return itemsList;
    }
    public static void menu(){
        System.out.println("Введие пункт фильтрации:");
        System.out.println("1: RAM");
        System.out.println("2: HDD");
        System.out.println("3: ОС");
        System.out.println("4: Цвет");
        System.out.println("5: Выход");
    }
}
