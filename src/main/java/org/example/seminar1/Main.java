package org.example.seminar1;

public class Main {
    public static void main(String[] args) {
        VendingMachineBottleOfWater vmBottleOfWater = new VendingMachineBottleOfWater();
        vmBottleOfWater.addBottle(new BottleOfWater("Вода1", 100, 5));
        vmBottleOfWater.addBottle(new BottleOfWater("Вода2", 1000, 10));
        vmBottleOfWater.addBottle(new BottleOfWater("Вода3", 1, 0.5));
        vmBottleOfWater.addBottle(new BottleOfWater("Вода4", 10, 1));
        vmBottleOfWater.addBottle(new BottleOfWater("Вода5", 150, 1.5));

        System.out.println(vmBottleOfWater.getProduct("Вода1"));
    }
}
