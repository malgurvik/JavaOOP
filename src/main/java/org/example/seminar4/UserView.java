package org.example.seminar4;

import java.util.List;

public interface UserView <T extends User>{
    void sendToConsole(List<T> users);
}
