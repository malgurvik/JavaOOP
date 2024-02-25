package org.example.homework04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }


    public List<Student> getSortedStudentGroup(){
        List<Student> studentList = new ArrayList<>(studentGroup.studentList);
        Collections.sort(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentGroupByFIO(){
        List<Student> studentList = new ArrayList<>(studentGroup.studentList);
        studentList.sort(new UserComparator<Student>());
        return studentList;
    }

    public void soutList(List<Student> studentList){
        for (Student student : studentList) {
            System.out.println(student);
        }

    }
}
