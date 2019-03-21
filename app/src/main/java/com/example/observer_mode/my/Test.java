package com.example.observer_mode.my;

import com.example.observer_mode.my.observer.Observer;
import com.example.observer_mode.my.observer.Observer1;
import com.example.observer_mode.my.observer.Observer2;
import com.example.observer_mode.my.observer.Observer3;
import com.example.observer_mode.my.subject.SubjectForMessage;

public class Test {
    public static void main(String[] args) {
        // 模拟一个被观察者
        SubjectForMessage subject = new SubjectForMessage();
        // 观察者1，2，3
        Observer observer1 = new Observer1(subject);
        Observer observer2 = new Observer2(subject);
        Observer observer3 = new Observer3(subject);

        subject.setMsg("20140420的3D号码是：127");
        subject.setMsg("20140421的3D号码是：333");
        subject.setMsg("20140421的3D号码是：789");
    }
}
