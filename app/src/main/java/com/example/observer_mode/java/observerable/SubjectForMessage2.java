package com.example.observer_mode.java.observerable;

import java.util.Observable;

/**
 * 可以观察的
 * <p>
 * 被观察者
 */
public class SubjectForMessage2 extends Observable {
    private String msg;


    public String getMsg() {
        return msg;
    }


    /**
     * 主题更新消息
     *
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();
        notifyObservers();
    }
}
