package org.example.itog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Items> itemsList = new ArrayList<>();
    public static void main(String[] args) {
        menu();
        boolean isRun = true;
        while (isRun){
            Scanner scanner = new Scanner(System.in);
            int q = scanner.nextInt();

            switch (q) {
                case 1:
                    itemsList = Add.abc();
                    menu();
                    break;
                case 2:
                    itemsList.forEach(items -> System.out.println("Название: "+items.name + ", " + "ОЗУ: " + items.ram + "Gb, " + "HDD: " + items.hdd + "Gb, " + "ОС: " + items.os + ", " + "Цвет: " + items.color));
                    menu();
                    break;
                case 3:
                    Filter.filter();
                    menu();
                    break;
                case 4:
                    System.out.println("4 варик");
                    break;
                default:
                    isRun = false;
                    System.out.println("Выход");
            }
        }
    }
    public static void menu(){
        System.out.println("Введите пункт меню:");
        System.out.println("1: Добавить ноутбук");
        System.out.println("2: Список ноутбуков");
        System.out.println("3: Фильтр");
        System.out.println("4: ");
        System.out.println("5: Выход");
    }
    public static List<Items> getList(){
        return itemsList;
    }
}
