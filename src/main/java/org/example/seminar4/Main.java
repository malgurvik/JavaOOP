package org.example.seminar4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Johann", "Sebastian", "Bah");
        Student student2 = new Student(2, "Ludvig", "Van", "Beethoven");
        Student student3 = new Student(3, "Petr", "Ilyich", "Chaikovsky");
        UserView<Student> sv = new StudentView();
        List<Student> studentList = new ArrayList<>(Arrays.asList(student1, student2, student3));
        sv.sendToConsole(studentList);
    }
}
