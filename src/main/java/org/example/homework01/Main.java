package org.example.homework01;

import org.example.seminar1.BottleOfWater;
import org.example.seminar1.VendingMachineBottleOfWater;

public class Main {
    public static void main(String[] args) {
        BottleOfWater bottle1 = new BottleOfWater("Вода1", 100, 5);
        BottleOfWater bottle2 = new BottleOfWater("Вода2", 150, 10);
        BottleOfWater bottle3 = new BottleOfWater("Вода3", 1, 0.5);
        BottleOfWater bottle4 = new BottleOfWater("Вода4", 10, 2);
        VendingMachineBottleOfWater vmBottleOfWater = new VendingMachineBottleOfWater();
        vmBottleOfWater.addBottle(bottle1);
        vmBottleOfWater.addBottle(bottle2);
        vmBottleOfWater.addBottle(bottle3);
        vmBottleOfWater.addBottle(bottle4);


        System.out.println(vmBottleOfWater.getProduct("Вода1"));

        VendingMachineHotDrinks vm = new VendingMachineHotDrinks();
        vm.addHotDrink(new HotDrinks("Coffe", 100, 0.3, 80));
        vm.addHotDrink(new HotDrinks("Tea", 100, 0.3, 100));
        vm.addHotDrink(new HotDrinks("Espresso", 100, 0.1, 80));

        System.out.println(vm.getProduct("Tea"));
        System.out.println(vm.getProduct("Coffe", 0.3, 10));
        System.out.println(vm.getProduct("Coffe", 0.3, 80));
    }
}
