package org.example.homework01;

public class HotDrinks extends BottleOfWater {
    private int temperature;

    public HotDrinks(String name, int cost, double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    @Override
    public String toString() {
        return "HotDrinks{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() +
                ", volume=" + super.getVolume() +
                ", temperature=" + temperature +
                '}';
    }
}
