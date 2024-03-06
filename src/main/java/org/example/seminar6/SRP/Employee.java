package org.example.seminar6.SRP;

public class Employee {
    public String name;


    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "name='" + name + '\'' +
                '}';
    }
}
