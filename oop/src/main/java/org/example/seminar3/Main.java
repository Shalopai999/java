package org.example.seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ListOfCats cats = new ListOfCats();
//        cats.setCatList(List.of(new Cat("barsik", 3),
//                                new Cat("murzik", 5),
//                                new Cat("vas'ka", 2)));

        List<Cat> list = new ArrayList<Cat>();
        list.add(new Cat("barsik", 3));
        list.add(new Cat("murzik", 5));
        list.add(new Cat("vas'ka", 2));
        list.add(new Cat("aida", 7));
//
//        System.out.println(cats.iterator().next().toString());
//
//        while (cats.iterator().hasNext()){
//            System.out.println(cats.iterator().next().getName() + " | age:" + cats.iterator().next().getAge());
//            ListOfCatIterator.counter++;
//
//        }
        Collections.sort(list, new SortByAge());
//        Collections.sort(list, new SortByName());

        for (Cat cat : list){
            System.out.println(cat.getName() + " | age:" + cat.getAge());
        }
    }
}