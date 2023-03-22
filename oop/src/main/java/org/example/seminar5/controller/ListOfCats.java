package org.example.seminar5.controller;

import org.example.seminar5.model.Model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListOfCats implements Iterable<Cat>, List<Cat> {
    private List<Cat> catList;

    public ListOfCats(Model model) {
    }

    public List<Cat> getCatList() {

        return catList;
    }

    public void setCatList(List<Cat> catList) {

        this.catList = catList;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Cat> iterator() {

        return new ListOfCatIterator(catList);
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Cat cat) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Cat> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Cat> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Cat get(int index) {
        return null;
    }

    @Override
    public Cat set(int index, Cat element) {
        return null;
    }

    @Override
    public void add(int index, Cat element) {

    }

    @Override
    public Cat remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Cat> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Cat> listIterator(int index) {
        return null;
    }

    @Override
    public List<Cat> subList(int fromIndex, int toIndex) {
        return null;
    }
}