package org.example.homework05.Service;

import org.example.homework05.Model.Student;
import org.example.homework05.Model.StudyGroup;
import org.example.homework05.Model.Teacher;

import java.util.List;

public class StudyGroupService {
    private StudyGroup studyGroup;
    public void createStudyGroup(Teacher teacher, List<Student> students){
        this.studyGroup = new StudyGroup(teacher, students);

    }

    public StudyGroup getStudyGroup() {
        return studyGroup;
    }
}


