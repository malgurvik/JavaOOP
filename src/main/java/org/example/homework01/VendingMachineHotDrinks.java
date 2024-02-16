package org.example.homework01;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineHotDrinks implements VendingMachine{
    private List<HotDrinks> productList;

    public VendingMachineHotDrinks() {
        this.productList = new ArrayList<>();
    }


    public void addHotDrink(HotDrinks drink){
        productList.add(drink);
    }

    public Product getProduct(String name, double volume, int temperature) {
        for (HotDrinks product : productList) {
            if (product.getName().equals(name) &&
                    product.getVolume() == volume &&
                    product.getTemperature() == temperature)
                return product;
        }
        return null;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name))
                return product;
        }
        return null;
    }

    public void initProduct(List<HotDrinks> list) {
        productList = list;
    }
}
