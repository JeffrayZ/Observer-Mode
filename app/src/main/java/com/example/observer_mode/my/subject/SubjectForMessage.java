package com.example.observer_mode.my.subject;

import com.example.observer_mode.my.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被订阅的消息
 */
public class SubjectForMessage implements Subject {
    /**
     * 肯定有许多人来订阅这个
     */
    List<Observer> list = new ArrayList<>();
    /**
     * 给什么消息给订阅者？
     * 这里给字符串
     */
    private String msg;

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void unRegisterObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer ob :
                list) {
            ob.update(msg);
        }
    }

    /**
     * 消息怎么来的？
     * */
    /**
     * 主题更新消息
     *
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
        // 消息来了，要通知到订阅者
        notifyObservers();
    }
}
