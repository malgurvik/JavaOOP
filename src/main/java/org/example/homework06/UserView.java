package org.example.homework06;

import java.util.List;

public interface UserView <T extends User>{
    void sendToConsole(List<T> users);
}
