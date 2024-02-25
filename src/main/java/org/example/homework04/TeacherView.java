package org.example.homework04;

import java.util.List;

public class TeacherView implements UserView<Teacher> {
    @Override
    public void sendToConsole(List<Teacher> users) {
        int count = 1;
        for (Teacher user : users) {
            System.out.printf("Teacher %d: %s\n", count++, user);
        }
    }
}

