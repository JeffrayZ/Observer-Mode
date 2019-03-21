package com.example.observer_mode.my.observer;

/**
 * 观察者需要实现的接口
 * */
public interface Observer {
    /**
     * 需要有一个地方去接收被观察者的通知，或者说是变动
     * */
    void update(String msg);
}
