package org.example.homework04;

import java.util.List;

public interface UserView <T extends User>{
    void sendToConsole(List<T> users);
}
