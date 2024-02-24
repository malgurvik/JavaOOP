package org.example.seminar3;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
        Student student1 = new Student(1, "Evgeny", "Evgenievich", "Guriev");
        Student student2 = new Student(2, "German", "Stanislavovich", "Puzikov");
        Student student3 = new Student(3, "John", "Man", "Weak");
        Student student4 = new Student(4, "Iohan", "Sebastian", "Bah");
        studentGroup.studentList.add(student3);
        studentGroup.studentList.add(student4);
        studentGroup.studentList.add(student1);
        studentGroup.studentList.add(student2);

        StudentGroupService service = new StudentGroupService(studentGroup);
        service.soutList(studentGroup.studentList);
        System.out.println();
        service.soutList(service.getSortedStudentGroup());
        System.out.println();
        service.soutList(service.getSortedStudentGroupByFIO());
//        System.out.println();
//        service.soutList(studentGroup.studentList);

//        System.out.println(student2.compareTo(student1));

//        StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
//        for (Student students : studentGroup){
//            System.out.println(students);
//        }

//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        iterator = new StudentGroupIterator(studentGroup);
//        System.out.println("---------------------------------------");
//        while (iterator.hasNext()){
//            if (iterator.next().getStudentId() == 1)
//                iterator.remove();
//        }
//        iterator.index = 0;
//        System.out.println("----------------------------------------");
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }
}
