package org.example.homework03;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream o1, Stream o2) {
        return o1.sizeOfGroup().compareTo(o2.sizeOfGroup());
    }
}
