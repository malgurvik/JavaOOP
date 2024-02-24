package org.example.homework03;


import java.util.List;

public class StreamService {
    public void getSortStream(List<Stream> streamList) {
        streamList.sort(new StreamComparator());
    }

    public void streamToConsole(List<Stream> streamList) {
        for (Stream stream : streamList) {
            System.out.println(stream);
        }
    }
}

