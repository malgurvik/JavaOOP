package org.example.homework05.Controller;

import org.example.homework05.Model.*;
import org.example.homework05.Service.DataService;
import org.example.homework05.Service.StudyGroupService;
import org.example.homework05.View.StudentView;
import org.example.homework05.View.StudyGroupView;

import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView view = new StudentView();
    private final StudyGroupView groupView = new StudyGroupView();
    private final StudyGroupService groupService = new StudyGroupService();

    public void createStudent(String firstName, String secondName, String lastName, Integer yearOfBirth) {
        service.create(firstName, secondName, lastName, yearOfBirth, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName, String lastName, Integer yearOfBirth) {
        service.create(firstName, secondName, lastName, yearOfBirth, Type.TEACHER);
    }

    public void getAllUsers() {
        for (User users : service.getUsers()) {
            System.out.println(users);
        }
    }

    public void getAllStudents() {

        for (Student student : service.getStudentList()) {
            view.printOnConsole(student);
        }
    }

    public void createStudyGroup(Integer teacherId, List<Integer> studentsID) {
        Teacher teacher = service.getTeacherByID(teacherId, service.getTeacherList());
        List<Student> students = service.getStudentListByID(studentsID);
        groupService.createStudyGroup(teacher, students);
    }

    public void getStudyGroup() {
        groupView.printOnConsole(groupService.getStudyGroup());
    }

}
