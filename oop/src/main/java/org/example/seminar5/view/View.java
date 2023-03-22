package org.example.seminar5.view;

import org.example.seminar5.controller.Cat;
import org.example.seminar5.controller.ListOfCats;

public class View {
    public View(ListOfCats listOfCats) {
    }

    public void init() {
        for (Cat cat : list) {
            System.out.println(cat.getName() + " | age:" + cat.getAge());
        }
    }
}
