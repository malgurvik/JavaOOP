package org.example.seminar5.Controller;

import org.example.seminar5.Model.Student;
import org.example.seminar5.Model.Type;
import org.example.seminar5.Model.User;
import org.example.seminar5.Service.DataService;
import org.example.seminar5.View.StudentView;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView view = new StudentView();
    public void createStudent(String firstName, String secondName, String lastName, Integer yearOfBirth){
        service.create(firstName, secondName, lastName, yearOfBirth, Type.STUDENT);
    }
    public void getAllStudents(){
        for (User student : service.getStudentList() ) {
            view.printOnConsole((Student) student);
        }
    }
}
