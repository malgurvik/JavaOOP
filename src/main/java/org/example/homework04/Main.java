package org.example.homework04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Tatiana", "Ivanovna", "Sidorova");
        Teacher teacher1 = new Teacher(2, "Ivan", "Vasilievich", "Ivanov");
        Teacher teacher2 = new Teacher(3, "Svetlana", "Borisovna", "Petrova");
        TeacherView tv = new TeacherView();
        TeacherService tservice = new TeacherService();
        List<Teacher> teacherList = new ArrayList<>(Arrays.asList(teacher1, teacher, teacher2));

        tv.sendToConsole(teacherList);
        System.out.println("-------------------------------");
        tservice.getSortedTeacherList(teacherList);
        tv.sendToConsole(teacherList);
        System.out.println("===================================");
        tservice.getSortedTeacherListByFIO(teacherList);
        tv.sendToConsole(teacherList);


//        Student student1 = new Student(1, "Johann", "Sebastian", "Bah");
//        Student student2 = new Student(2, "Ludvig", "Van", "Beethoven");
//        Student student3 = new Student(3, "Petr", "Ilyich", "Chaikovsky");
//        UserView<Student> sv = new StudentView();
//        List<Student> studentList = new ArrayList<>(Arrays.asList(student1, student2, student3));
//        sv.sendToConsole(studentList);
    }
}
