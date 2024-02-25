package org.example.homework04;

public class Student extends User implements Comparable<Student> {
    private Integer studentId;

    public Student(Integer studentId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    @Override
    public String toString() {
        return "Student {" + studentId +
//                super.toString() +
                ", " + super.getFirstName() +
                ", " + super.getSecondName() +
                ", " + super.getLastName() +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);

//        if (this.studentId > o.studentId)
//            return 1;
//        else if (this.studentId < o.studentId)
//            return -1;
//        else return 0;

    }
}
