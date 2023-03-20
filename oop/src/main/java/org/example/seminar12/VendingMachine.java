package org.example.seminar12;

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;
}