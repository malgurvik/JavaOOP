package org.example.seminar5.Service;

import org.example.seminar5.Model.Student;
import org.example.seminar5.Model.Teacher;
import org.example.seminar5.Model.Type;
import org.example.seminar5.Model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> users = new ArrayList<>();
    public void create(String firstName, String secondName, String lastName, Integer yearOfBirth, Type type){
        Integer id = getFreeID(type);
        if (type == Type.STUDENT){
            users.add(new Student(id, firstName, secondName, lastName, yearOfBirth));
        } else if (type == Type.TEACHER) {
            users.add(new Teacher(id, firstName, secondName, lastName, yearOfBirth));
        }
    }
    private int getFreeID(Type type){
        boolean isStudent = type == Type.STUDENT;
        int lastId = 1;
        for (User user : users) {
            if (user instanceof Student && isStudent){
                lastId = ((Student) user).getStudentID() + 1;
            } else if (user instanceof Teacher && !isStudent) {
                lastId = ((Teacher) user).getTeacherID() + 1;
            }
        }
        return lastId;
    }
    public List<User> getUsers() {
        return users;
    }
    public List<User> getStudentList(){
        List<User> studentList = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Student ){
                studentList.add((Student) user);
            }
        }
        return studentList;
    }
}
