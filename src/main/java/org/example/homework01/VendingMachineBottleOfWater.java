package org.example.homework01;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineBottleOfWater implements VendingMachine {

    private List<BottleOfWater> productList;

    public VendingMachineBottleOfWater() {
        this.productList = new ArrayList<>();
    }

    public void addBottle(BottleOfWater bottle){
        productList.add(bottle);
    }

    @Override
    public Product getProduct(String name) {
        for (BottleOfWater product : productList) {
            if (product.getName().equals(name))
                return product;
        }
        return null;
    }


    public void initProduct(List<BottleOfWater> list) {
        productList = list;
    }
}
