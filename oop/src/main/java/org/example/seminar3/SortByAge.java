package org.example.seminar3;

import java.util.Comparator;

public class SortByAge implements Comparator<Cat> {

    @Override
    public int compare(Cat cat1, Cat cat2) {
        if(cat1.getAge() < cat2.getAge()){
            return -1;
        }

        if(cat1.getAge() == cat2.getAge()){
            return 0;
        }

        return 1;
    }
}
