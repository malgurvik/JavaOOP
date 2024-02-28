package org.example.homework05.Model;


public class Student extends User {
    private Integer studentID;

    public Student(Integer studentID, String firstName, String secondName, String lastName, Integer yearOfBirth) {
        super(firstName, secondName, lastName, yearOfBirth);
        this.studentID = studentID;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student {" +
                "ID: " + studentID + " "
                + super.toString() +
                '}';
    }
}
