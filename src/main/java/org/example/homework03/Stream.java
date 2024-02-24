package org.example.homework03;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>, Comparable<Stream>{
    private List<StudentGroup> studentGroupList;
    public Stream(List<StudentGroup> studentGroupList) {
        this.setStudentGroupList(studentGroupList);
    }

    public Integer sizeOfGroup(){
        return getStudentGroupList().size();
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public String toString() {
        return "Stream{" + studentGroupList + '}';
    }

    @Override
    public int compareTo(Stream o) {
        return this.sizeOfGroup().compareTo(o.sizeOfGroup());
    }
}
