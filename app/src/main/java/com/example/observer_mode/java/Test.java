package com.example.observer_mode.java;

import com.example.observer_mode.java.observer.Observer1;
import com.example.observer_mode.java.observer.Observer2;
import com.example.observer_mode.java.observer.Observer3;
import com.example.observer_mode.java.observerable.SubjectForMessage;
import com.example.observer_mode.java.observerable.SubjectForMessage2;

import java.util.Observer;

public class Test {
    public static void main(String[] args) {
        // 模拟一个被观察者
        SubjectForMessage subject = new SubjectForMessage();
        SubjectForMessage2 subject2 = new SubjectForMessage2();
        // 观察者1，2，3
        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();
        Observer observer3 = new Observer3();

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        subject2.addObserver(observer1);
        subject2.addObserver(observer2);
        subject2.addObserver(observer3);

        subject.setMsg("subject：127");
        subject.setMsg("subject：333");
        subject.setMsg("subject：789");


        subject2.setMsg("subject2：127");
        subject2.setMsg("subject2：333");
        subject2.setMsg("subject2：789");
    }
}
