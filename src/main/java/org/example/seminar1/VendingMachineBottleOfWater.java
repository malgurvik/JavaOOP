package org.example.seminar1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineBottleOfWater implements VendingMachine{

    List<Product> productList = new ArrayList<>();

    public void addBottle(BottleOfWater bottle){
        productList.add(bottle);
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name))
                return product;
        }
        return null;
    }

    @Override
    public void initProduct(List<Product> list) {
        productList = list;
    }
}
