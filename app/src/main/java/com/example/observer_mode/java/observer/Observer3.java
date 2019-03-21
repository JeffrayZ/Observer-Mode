package com.example.observer_mode.java.observer;

import com.example.observer_mode.java.observerable.SubjectForMessage;
import com.example.observer_mode.java.observerable.SubjectForMessage2;

import java.util.Observable;
import java.util.Observer;

public class Observer3 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SubjectForMessage) {
            SubjectForMessage subjectForMessage = (SubjectForMessage) o;
            System.out.println("SubjectForMessage《》Observer3" + subjectForMessage.getMsg());
        }

        if (o instanceof SubjectForMessage2) {
            SubjectForMessage2 subjectForMessage = (SubjectForMessage2) o;
            System.out.println("SubjectForMessage2《》Observer3" + subjectForMessage.getMsg());
        }
    }
}
