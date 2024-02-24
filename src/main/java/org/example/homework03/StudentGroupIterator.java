package org.example.homework03;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private List<Student> studentList;
    int index = 0;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.studentList;
    }


    @Override
    public boolean hasNext() {
        return index < studentList.size();
    }

    @Override
    public Student next() {
        if(!hasNext())
            return null;
        return studentList.get(index++);

    }


    @Override
    public void remove() {
        studentList.remove(--index);
    }
}
