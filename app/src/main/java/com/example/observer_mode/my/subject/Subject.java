package com.example.observer_mode.my.subject;

import com.example.observer_mode.my.observer.Observer;

/**
 * 被观察者需要实现的接口
 * */
public interface Subject {
    /**
     * 注册一个观察着
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除一个观察者
     *
     * @param observer
     */
    void unRegisterObserver(Observer observer);

    /**
     * 通知所有的观察着
     */
    void notifyObservers();
}
