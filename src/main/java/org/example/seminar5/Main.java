package org.example.seminar5;

import org.example.seminar5.Controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Aaa", "Bbb", "Ccc", 1984);
        controller.createStudent("Ttt", "Bbb", "Ppp", 1983);
        controller.createStudent("Aaa", "Ooo", "Mmm", 1985);
        controller.getAllStudents();
    }
}
