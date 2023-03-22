package org.example.seminar5;

import org.example.seminar5.controller.Cat;
import org.example.seminar5.controller.ListOfCats;
import org.example.seminar5.controller.SortByAge;
import org.example.seminar5.model.Model;
import org.example.seminar5.view.View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        ListOfCats listOfCats = new ListOfCats(model);
        View view = new View(listOfCats);
//
//        List<Cat> list = new ArrayList<Cat>();
//        list.add(new Cat("barsik", 3));
//        list.add(new Cat("murzik", 5));
//        list.add(new Cat("vas'ka", 2));
//        list.add(new Cat("aida", 7));

        view.init();
//
//        Collections.sort(list, new SortByAge());
////        Collections.sort(list, new SortByName());
//
//        for (Cat cat : list){
//            System.out.println(cat.getName() + " | age:" + cat.getAge());
//        }
    }
}