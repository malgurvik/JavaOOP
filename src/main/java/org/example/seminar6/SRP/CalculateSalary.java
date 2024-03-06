package org.example.seminar6.SRP;

public class CalculateSalary {
    int baseSalary;
    int valueTime;

    public CalculateSalary(int baseSalary, int valueTime) {
        this.baseSalary = baseSalary;
        this.valueTime = valueTime;
    }
    public int calculateSalary(){
        return valueTime * baseSalary;
    }
}
