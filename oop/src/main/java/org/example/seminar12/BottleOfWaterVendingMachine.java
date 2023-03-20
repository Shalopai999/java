package org.example.seminar12;

import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {
    private final List<Product> products;

    public BottleOfWaterVendingMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name){
        for(Product product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("РџСЂРѕРґСѓРєС‚ c РЅР°Р·РІР°РЅРёРµРј %s РЅРµ РЅР°Р№РґРµРЅ.", name));
    }

    public BottleOfWater getProduct(String name, int volume){
        for(Product product: products){
            if(product instanceof BottleOfWater){
                if(product.getName().equalsIgnoreCase(name) && ((BottleOfWater) product).getVolume() == volume){
                    return (BottleOfWater) product;
                }
            }

        }
        throw new IllegalStateException(String.format("РџСЂРѕРґСѓРєС‚ c РЅР°Р·РІР°РЅРёРµРј %s РЅРµ РЅР°Р№РґРµРЅ.", name));
    }
}