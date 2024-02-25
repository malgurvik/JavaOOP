package org.example.homework04;


import java.util.Collections;
import java.util.List;

public class TeacherService {
    public void getSortedTeacherList(List<Teacher> teacherList) {
        Collections.sort(teacherList);
    }

    public void getSortedTeacherListByFIO(List<Teacher> teacherList) {
        teacherList.sort(new UserComparator<Teacher>());
    }

    public void soutList(List<Teacher> teacherList){
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }
}
