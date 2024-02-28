package org.example.homework05.Model;

public class Teacher extends User {
    private Integer teacherID;
    public Teacher(Integer teacherID, String firstName, String secondName, String lastName, Integer yearOfBirth) {
        super(firstName, secondName, lastName, yearOfBirth);
        this.teacherID = teacherID;
    }

    public Integer getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Teacher {" +
                "ID: " + teacherID + " "
                + super.toString() +
                '}';
    }
}
