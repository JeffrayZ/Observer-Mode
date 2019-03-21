package com.example.observer_mode.my.observer;

import com.example.observer_mode.my.subject.Subject;

public class Observer3 implements Observer {
    public Observer3(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        /**
         * 每个订阅者拿到消息后，可以做不同的反应
         *
         * 有人阅读，有人删除，有人不予理睬
         */
        System.out.println("我是Observer3,我不予理睬" + msg);
    }
}
