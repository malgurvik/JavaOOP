package org.example.homework03;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    private List<StudentGroup> studentGroupList;
    int index = 0;

    public StreamIterator(Stream stream) {
        this.studentGroupList = stream.getStudentGroupList();
    }

    @Override
    public boolean hasNext() {
        return index < studentGroupList.size();
    }

    @Override
    public StudentGroup next() {
        if (!hasNext())
            return null;
        return studentGroupList.get(index++);
    }

    @Override
    public void remove() {
        studentGroupList.remove(--index);
    }
}
