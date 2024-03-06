package org.example.seminar6.DIP;

public class PetrolEngine implements Engine{
    @Override
    public void start(){
        System.out.println("Завели бензиновый двигатель");
    }
}