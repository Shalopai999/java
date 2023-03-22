package org.example.seminar5.model;

import org.example.seminar5.controller.Cat;
import org.example.seminar5.controller.ListOfCats;


import java.util.ArrayList;
import java.util.List;

public class Model implements Iterable<Cat>, List<Cat>{
    List<Cat> list1 = new ArrayList<Cat>();
    list1.add(new Cat("barsik", 3));
    list1.add(new Cat("murzik", 5));
    list1.add(new Cat("vas'ka", 2));
    list1.add(new Cat("aida", 7));

    @Override
    public void add(int index, Cat element) {

    }
}
