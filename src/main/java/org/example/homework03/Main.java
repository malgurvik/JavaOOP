package org.example.homework03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup1 = new StudentGroup(new ArrayList<>(Arrays.asList(
                new Student(1, "Evgeny", "Evgenievich", "Guriev"),
                new Student(2, "German", "Stanislavovich", "Puzikov"),
                new Student(3, "John", "Man", "Weak"))));
        StudentGroup studentGroup2 = new StudentGroup(new ArrayList<>(Arrays.asList(
                new Student(1, "Johann", "Sebastian", "Bah"),
                new Student(2, "Ludvig", "Van", "Beethoven"),
                new Student(3, "Petr", "Ilyich", "Chaikovsky"))));
        StudentGroup studentGroup3 = new StudentGroup(new ArrayList<>(Arrays.asList(
                new Student(1, "Alexandr", "Sergeevich", "Pushkin"),
                new Student(2, "Lev", "Nikolaevich", "Tolstoy"),
                new Student(2, "Nikolay", "Vasilievich", "Gogol"))));


        List<Stream> streamList = new ArrayList<>();
        Stream stream1 = new Stream(new ArrayList<>(Arrays.asList(studentGroup1, studentGroup2, studentGroup3)));
        streamList.add(stream1);
        Stream stream2 = new Stream(new ArrayList<>(Arrays.asList(studentGroup3, studentGroup2)));
        streamList.add(stream2);

        System.out.println("stream1 = " + stream1);
        System.out.println("stream2 = " + stream2);
        StreamService service = new StreamService();
        service.getSortStream(streamList);
        System.out.println();
        service.streamToConsole(streamList);
    }
}
