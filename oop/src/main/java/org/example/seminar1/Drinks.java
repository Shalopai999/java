package org.example.seminar1;

public abstract class Drinks {
    private String name;
    private Double volume;
    private Integer price;

    public Drinks(){

    }

    public Drinks(String name, Double volume, Integer price){
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public Double getVolume(){
        return volume;
    }

    public Integer getPrice(){
        return price;
    }
}
