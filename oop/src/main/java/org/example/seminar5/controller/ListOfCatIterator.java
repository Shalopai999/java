package org.example.seminar5.controller;

import java.util.Iterator;
import java.util.List;

public class ListOfCatIterator implements Iterator<Cat> {
    private List<Cat> catListIteartor;
    public ListOfCatIterator(List<Cat> catListIteartor){
        this.catListIteartor = catListIteartor;

    }
    public static int counter;
    @Override
    public boolean hasNext() {

        return counter < catListIteartor.size();
    }

    @Override
    public Cat next() {
        if (!hasNext()){
            return null;
        }
        return catListIteartor.get(counter);
    }
}