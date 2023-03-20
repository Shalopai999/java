package org.example.seminar1;

public class HotDrinks extends Drinks{
    boolean sugar;
    int temp;

    public HotDrinks(String name, Double volume, Integer price, Boolean sugar, Integer temp){
        super(name, volume, price);
        this.sugar = sugar;
        this.temp = temp;
    }
    public Boolean getSugar(){
        return sugar;
    }

    public Integer getTemp(){

        return temp;
    }
}
